import classes.*


fun main() {
    var store = Store()
    fun menue() {
        var kunde: Kunde = Kunde("David", "Schulz", 2200.58, 123467, "user123")
        println("Willkommen in unseren Geschäft! wir habe Textilien und schmuck anzubieten!")
        do {
            println("Herzlich Willkommen in unserem Store!")
            println("1 -> anmeldung")
            println("2 -> Registrieren")
            println("3 -> ausloggen")
            println("4 -> wareAuswahlProdukt")
            println("5 -> wareAuswahlKleidung")
            var imput = readln()
            println("Sie haben: $imput gewählt")
            when (imput) {
                //Habe für das menü leider nicht genügend Zeit gehabt, um es zu vollenden
                "1" -> {
                    kunde = store.anmeldung()
                }
                "2" -> {
                    store.registrieren()
                    break
                }
                "3" -> println("Das Menü ist noch in arbeit")
                "4" -> println("Das Menü ist noch in arbeit")
                "5" -> println("Das Menü ist noch in arbeit")
            }
        }while (true)

        //Store Einführung.
                                                                                                           //Erben von Kunden class
        //Kundenanmeldung und abspeichern.
        while (true) {
            println("Welche der artikel möchten sie wählen?:")
            println("Wir haben zu auswahl:")
            println("----------------------------------------")
            // Vorstellung der ware & Einkauf mit einer (do-while-schleife)
            do {                                                                                                            // Eine do/while schleife, um den Einkauf dem kunden zu ermöglichen
                //Store vorstellung und Einkauf

                //Den Kleidungsstücken einen index geben.
                //Kleidungsstücke mit index Ausgeben lassen.
                for (i in store.kleidungsliste.indices) {
                    var kleidungsstueck = store.kleidungsliste[i]
                    println("${i}: Art: ${kleidungsstueck.produktArt}, Größe: ${kleidungsstueck.groesse}, Preis: ${kleidungsstueck.preis}, Farbe; ${kleidungsstueck.farbe}, Anzahl: ${kleidungsstueck.anzahl}")
                }
                println("----------------------------------------")
                println("Wählen sie ein Produkt")

                // Produktauswahl
                try {
                    var index = store.wareAuswahlKleidung(kunde)                                                            // Eine Eingabe Funktion mit einem index
                    store.kleidungsliste[index].removeOne()                                                                 // Die funktion löscht das element aus der liste.
                } catch (es: Exception) {
                    println("Die eingabe war falsch,Bitte versuche es noch einmal!")
                }


                //Wahre in den Warenkorb hinzufügen.
                println("-----------------------------------------")
                //Warenkorb in der konsole ausgeben lassen.
                println("In ihren wahrenkorb ist:")
                println("${kunde.warenkorb}")

                println("Wollen sie weitere Wahre Wählen?")                                                                 // Eine "if" abfrage ob der Kunde mehr Kleidung Wählen will.
                var imput = readln()
                if (imput == "9") {                                                                                         //->(true) imput!   //Wenn der imput "1" ist bricht man den Einkauf ab und man kommt dann weiter.
                    break                                                                                                   //Wenn die zahl "1" gewält worden ist, bricht(break) die schleife den vorgang ab, und geht weiter.
                }
            } while (true)                                                                                                  //Die (While-Schleife) läuft, solange die Bedingung (true) ist.


            //Preis vom Konto Abrechnen.
            kunde.bezahlen()                                                                                                //Bezahl Funktion.
            println("Sie haben noch ${kunde.kontoStand}€ auf ihrem Konto")

            println("-----------------------------------------")
            println("Wollen sie noch ein weiteres produkt wählen?")

            //Anzeigen von Unterkategorien.

            do {                                                                                                            // Eine do/while schleife, um den Einkauf dem kunden zu ermöglichen.
                //der Produktliste einen index geben.
                //Produktliste mit index Ausgeben lassen.
                for (i in store.produktListe.indices) {
                    var zubehör = store.produktListe[i]
                    println("${i}: Art: ${zubehör.produktArt}, Größe: ${zubehör.groesse}, Preis: ${zubehör.preis}, Farbe; ${zubehör.farbe}, Anzahl: ${zubehör.anzahl}")
                }
                println("----------------------------------------")
                println("Wählen sie ein Produkt")

                // Produktauswahl
                try {
                    var index = store.wareAuswahlProdukt(kunde)                                                             // Eine Eingabe Funktion mit einem index
                    store.produktListe[index].removeOne()                                                                   // Die funktion löscht das element aus der liste.
                } catch (es: Exception) {
                    println("Leider falsche eingabe! Bitte versuche es nochmal.Wähle die Zahlen von 0-5!")
                }


                //Wahre in den Warenkorb hinzufügen.
                println("-----------------------------------------")
                //Warenkorb in der konsole ausgeben lassen.
                println("In ihren wahrenkorb ist:")
                for (arikel in kunde.warenkorb) {
                    println("${arikel.produktArt} ${arikel.preis} ${arikel.anzahl}")
                }


                println("Wollen sie weitere Wahre Wählen?")                                                                 // Eine "if" abfrage ob der Kunde mehr Kleidung Wählen will.
                var imput = readln()
                if (imput == "9") {                                                                                         //->(true) imput!   //Wenn der imput "1" ist bricht man den Einkauf ab und man kommt dann weiter.
                    break                                                                                                   //Wenn die zahl "1" gewält worden ist, bricht(break) die schleife den vorgang ab, und geht weiter.
                }
            } while (true)

            kunde.bezahlen()                                                                                                //Bezahl Funktion.
            println("Vielen Dank für ihren einkauf!Der Kassenbon wird gedruckt bitte warten!")
            Thread.sleep(3000)                                                                                         // Das system 3 sekunden lang warten lassen.
            println("--------xxxxxxxxxxxxxxx-----------")
            //Kassenbon Ausdrucken:
            println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
            println("-------------receipt------------")
            for (artikel in kunde.warenkorb) {
                println("|Your shopping cart:: ${artikel.produktArt}")                                                      // Die Einkaufsliste vom Kunden
            }
            println("""
        |You have paid:       ${kunde.bezahlen()}
        |*************
        |Payment Finished!
        |Remaining credit:    ${kunde.kontoStand}
        |---------Thank´s for Payment!---------
    """.trimMargin())
            println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
            store.ausloggen()                                                                                               // Eine Funktion mit einer abfrage, ob man weiter shoppen will oder ausloggen möchte.
        }

    }
    menue()
}
//-> Mitarbeiter Preise/ware änder können.//habe ich leider zeitlich nicht geschafft! :(
