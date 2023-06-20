package classes

import kotlin.random.Random

open class Store {
    //Einzelne kleidungststücke umwandeln zu einer MutableList.
    val kleidungsstueck1 = Kleidungsstueck("Shorts", "XL", 17.99, "Blau", 2)

    val kleidungsstueck2 = Kleidungsstueck("T-Shirt", "M", 8.95, "rot", 3)

    val kleidungsstueck3 = Kleidungsstueck("Joggis", "M", 7.99, "Schwarz", 5)

    val kleidungsstueck4 = Kleidungsstueck("Jeans", "L", 14.95, "Schwarz", 3)

    var kleidungsliste: MutableList<Kleidungsstueck> = mutableListOf(
            kleidungsstueck1,
            kleidungsstueck2,
            kleidungsstueck3,
            kleidungsstueck4
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

    //Registrierungsvorgang, wenn man zu oft die falschen Daten eingibt.
    fun registrieren(): Kunde {
        println("Bitte geben sie ihren namen ein")
        var neuerName = readln()
        println("Bitte geben sie ihren Nachnamen ein")
        var neuerNachname = readln()
        println("Bitte geben sie ihren Konto ein")
        var neuesKonto = readln()
        println("Bitte geben sie ihren Passwort ein")
        var neuePasswort = readln()                                           //Random.nextInt gibt zufällig eine ID aus.
        var neuePerson = Kunde(neuerName, neuerNachname, neuesKonto.toDouble(), Random.nextInt(10000), neuePasswort)
        kundenliste.add(neuePerson)
        return neuePerson
    }

    //Anmeldevorgang für Kunden.
    open fun anmeldung(): Kunde {
        var logged = false


        var versuche = 0
        while (true) {

            //Abfrage der Personalien.
            println("Bitte hier einmal Anmelden:")
            println("ihr Name Bitte?:")
            var eingabeName = readln()
            println("Hallo $eingabeName")


            // Passwortabfrage.

            println("geben sie ihr Passwort ein:")
            var pw: String? = readln()
            //Fragt ab, ob eingegebener passwort und der name übereinstimmt
            var resoult = kundenliste.find { it.name == eingabeName && it.passwort == pw }
            if (resoult != null) {
                logged = true
                println("Willkommen in unserem Store!")
                return resoult
            } else if (versuche == 3) {
                println("Sie haben zu oft versucht falsch einzuloggen, Bitte Registrieren sie sich Neu")
                //Wenn der kunde sich falsch anmeldet
                return registrieren()
            }
            println("Ihre daten stimmen nicht überein, bitte versuche es später nochmal.")

            versuche++ // + 1 versuch
        }
    }

    //Warenauswahl add/remove Liste.
    fun wareAuswahlKleidung(kunde: Kunde): Int {

        var imput = readln().toInt()                            //-> Eingabe mit integer(zahl) welche ware man haben will.
        var eingegebeneWahre = kleidungsliste[imput]
        println(kunde.warenkorb)
        println("Sie haben sich für die ${eingegebeneWahre.produktArt} ${eingegebeneWahre.preis} entschieden,gute Wahl!")
        kunde.warenkorb.add(eingegebeneWahre)                                                   // Die ware zu warenkorb hinzufügen!
        eingegebeneWahre.removeOne()
        return imput                                                                            // Hier wird der eingegebene "imput" Wiedergegeben


    }

    fun wareAuswahlProdukt(kunde: Kunde): Int {

        var imput = readln().toInt()                            //-> Eingabe mit integer(zahl) welche ware man haben will.
        var eingegebeneWahre = produktListe[imput]
        println("Sie haben sich für: ${eingegebeneWahre.produktArt} ${eingegebeneWahre.preis} entschieden,gute Wahl!")
        kunde.warenkorb.add(eingegebeneWahre)                                                   // Die ware zu warenkorb hinzufügen!
        eingegebeneWahre.removeOne()
        return imput                                                                            // Hier wird der eingegebene "imput" Wiedergegeben


    }

}
/*
    ()  fun kaufen(produkt: Produkt) {

        if (anmeldung()) {
            produktList?.forEach {
                println("${produkt.produktArt} ${produkt.groesse} ${produkt.preis} ${produkt.farbe} ${produkt.anzahl}")
            }
            warenkorb?.add(produkt)
        } else {
            println("Produkt ist leider nicht verfügbar.")
        }
    }

}



 */