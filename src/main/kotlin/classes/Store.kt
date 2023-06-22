package classes

import kotlin.random.Random

open class Store {
    //Einzelne kleidungststücke umwandeln zu einer MutableList.
    var kleidungsstueck1 = Kleidungsstueck("Shorts", "XL", 17.99, "Blau", 2)

    var kleidungsstueck2 = Kleidungsstueck("T-Shirt", "M", 8.95, "rot", 3)

    var kleidungsstueck3 = Kleidungsstueck("Joggis", "M", 7.99, "Schwarz", 5)

    var kleidungsstueck4 = Kleidungsstueck("Jeans", "L", 14.95, "Schwarz", 3)

    var kleidungsstueck5 = Kleidungsstueck("Pullover", "L", 16.95, "Neon Grün", 3)

    var kleidungsstueck6 = Kleidungsstueck("Socken", "40-43", 2.95, "Schwarz", 3)
        // Eine MutableList für alle Kleidungsstücke.
    var kleidungsliste: MutableList<Kleidungsstueck> = mutableListOf(
            kleidungsstueck1,
            kleidungsstueck2,
            kleidungsstueck3,
            kleidungsstueck4,
            kleidungsstueck5,
            kleidungsstueck6
    )

    // Die 1te Unterkategorie.
    var uhr = Produkt("Uhr", "M", 19.99, "Schwarz", 5)
    var armband = Produkt("Armband", "S", 4.99, "Grün", 4)
    var kette = Produkt("kette", "L", 24.95, "Gold", 7)

    // Die 2te Unterkategorie.
    var cap = Produkt("Cap", "XL", 7.99, "Rot", 10)
    var mütze1 = Produkt("Mütze", "XL", 7.99, "Gelb", 8)
    var mütze2 = Produkt("Mütze", "XL", 7.99, "Blau", 6)

    //Produkt Liste
    var produktListe: MutableList<Produkt> = mutableListOf(
            uhr,
            armband,
            kette,
            cap,
            mütze1,
            mütze2
    )


    // Neu erstellte Personen/Kunden
    var person1 = Kunde("David", "Schulz", 2200.58, 123467, "user123")
    var person2 = Kunde("Siggi", "Würdich", 2070.68, 1234565, "user123")
    var kundenliste: MutableList<Kunde> = mutableListOf(
            person1,
            person2
    )

    // Mitarbeiter.
    var mitarbeiter1 = Mitarbeiter("Ranko", "Grotte", 2050.28, 987654321, "User321")
    var mitarbeiter = Mitarbeiter("Danger", "Stein", 2300.98, 987654321, "User321")

    //Mitarbeiter Liste erstellen
    var mitarbeiterListe: MutableList<Person> = mutableListOf(
            mitarbeiter,
            mitarbeiter1
    )

    //Registrierungsvorgang: wenn man zu oft die falschen Daten eingibt oder sich direkt Registriert.
    fun registrieren(): Kunde {
        println("Bitte geben sie ihren namen ein")
        var neuerName = readln()
        println("Bitte geben sie ihren Nachnamen ein")
        var neuerNachname = readln()
        println("Bitte geben sie ihren Konto ein")
        var neuesKonto = readln()
        println("Bitte geben sie ihren Passwort ein")
        var neuePasswort = readln()                                                                                     //Random.nextInt gibt zufällig eine ID aus.
        var neuePerson = Kunde(neuerName, neuerNachname, neuesKonto.toDouble(), Random.nextInt(10000), neuePasswort)
        kundenliste.add(neuePerson)
        return neuePerson
    }

    //Anmeldevorgang für Kunden.
    open fun anmeldung(): Kunde {
        var logged = false                                                                                              //hier sagt das system das der user noch nicht eingeloggt ist.


        var versuche = 0
        while (true) {

            //Abfrage der Personalien.
            println("Bitte hier einmal Anmelden:")
            println("ihr Name Bitte?:")
            var eingabeName = readln()
            println("Hallo $eingabeName")


            // Passwortabfrage.

            println("geben sie ihr Passwort ein:")
            var pw: String? = readln()                                                                                  //Passwort abfrage
            println("Bitte warten... die daten werden überprüft!")
            Thread.sleep(3000)
            //Fragt ab, ob eingegebener passwort und der name übereinstimmt
            var resoult = kundenliste.find { it.name == eingabeName && it.passwort == pw }                              //Hier überprüft der code, ob das eingegebene auch übereinstimmt.
            if (resoult != null) {
                logged = true                                                                                           //Wenn alles übereinstimmt, dann ist der user eingeloggt
                println("Willkommen in unserem Store!")
                return resoult
            } else if (versuche == 3) {                                                                                 //Wenn der user seine 3 versuche aufbraucht, muss er sich neu Registrieren.(siehe weiter unten)
                println("Sie haben zu oft versucht falsch einzuloggen, Bitte Registrieren sie sich Neu")
                //Wenn der kunde sich falsch anmeldet
                Thread.sleep(3000)
                return registrieren()                                                                                   //return registrieren()
            }
            println("Ihre daten stimmen nicht überein, bitte versuche es später nochmal.")

            versuche++                                                                                                  // + 1 versuch
        }
    }

    //Warenauswahl add/remove Liste.
    fun wareAuswahlKleidung(kunde: Kunde): Int {
        for (i in kleidungsliste.indices) {
            var kleidungsstueck = kleidungsliste[i]
            println("${i}: Art: ${kleidungsstueck.produktArt}, Größe: ${kleidungsstueck.groesse}, Preis: ${kleidungsstueck.preis}, Farbe; ${kleidungsstueck.farbe}, Anzahl: ${kleidungsstueck.anzahl}")
            println("Geben sie eine Zahl zwischen 0-5 ein um ware zu wählen, oder die (9) um einfach weiteren schritt zu gehen.")
        }
        println("Geben sie eine Zahl zwischen 0-5 ein um ware zu wählen, oder die (9) um zu überspringem.")
        var imput = readln().toInt()                                                                                    //-> Eingabe mit integer(zahl) welche ware man haben will.
        var eingegebeneWahre = kleidungsliste[imput]
        println(kunde.warenkorb)                                                                                        // Zeigt den warenkorb in der konsole an.
        println("Sie haben sich für die ${eingegebeneWahre.produktArt} ${eingegebeneWahre.preis} entschieden,gute Wahl!")
        kunde.warenkorb.add(eingegebeneWahre)                                                                           // Die ware zu warenkorb hinzufügen!
        eingegebeneWahre.removeOne()                                                                                    //Löscht die gewählte ware aus dem warenkorb.
        println("Bitte ein moment warten...")
        Thread.sleep(3000)
        return imput                                                                                                    // Hier wird der eingegebene "imput" Wiedergegeben


    }

    fun wareAuswahlProdukt(kunde: Kunde): Int {
        for (i in produktListe.indices) {
            var zubehör = produktListe[i]
            println("${i}: Art: ${zubehör.produktArt}, Größe: ${zubehör.groesse}, Preis: ${zubehör.preis}, Farbe; ${zubehör.farbe}, Anzahl: ${zubehör.anzahl}")
        }
        var input = readln().toInt()                                                                                    //-> Eingabe mit integer(zahl) welche ware man haben will.
        var eingegebeneWahre = produktListe[input]
        println("Sie haben sich für: ${eingegebeneWahre.produktArt} ${eingegebeneWahre.preis} entschieden,gute Wahl!")
        kunde.warenkorb.add(eingegebeneWahre)                                                                           // Die ware zu warenkorb hinzufügen!
        eingegebeneWahre.removeOne()                                                                                    // Die ware aus dem Warenkorb löschen.
        println("Bitte warte...")
        Thread.sleep(3000)
// Hier wird der eingegebene "imput" Wiedergegeben
        return input
    }

    fun ausloggen() {
        println("Wollen sie sich ausloggen?")
        println("(ja): zum ausloggen (nein): zum weitereinkauf.")
        var imput = readln()
        if (imput.equals("ja", ignoreCase = true)) {                                                              //equals: Überprüft den inhalt, ob er gleich ist. (Boolean) //wenn das "ignoreCase" auf (true) gestellt ist
            println("Bitte ein moment warten...")
            Thread.sleep(3000)
            println("Sie haben sich erfolgreich ausgeloggt.")                                                           //..dann ist es egal, ob man groß oder kleinSchreibt ist der inhalt trotzdem der gleiche, ist der wert auf (false), vergleicht er klein & Groß
            System.exit(0)                                                                                        //Beendet das program

        } else {
            println("weiter gehts! :)")
        }
    }
}
