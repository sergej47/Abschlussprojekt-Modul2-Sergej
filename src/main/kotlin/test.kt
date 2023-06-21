import classes.*


fun main() {
    var store = Store()                                                                                                 //Erben von Store class
    //Store Einführung.
    println("Willkommen in unseren Geschäft! wir habe Textilien und schmuck anzubieten!")

    // Anmeldungsvogang
    //Kundenanmeldung und abspeichern.
    var kunde: Kunde                                                                                                    //Erben von Kunden class
    //var mitarbeiter: Mitarbeiter
    while (true) {
        try {                                                                                                           // try catch: fängt die eingabe fehler ab und lässt das system weiterarbeiten, statt abzustürzen.

            kunde = store.anmeldung()
            //mitarbeiter = store.anmeldung()
            break
        } catch (ex: Exception) {
            println("Ihre eingabe war falsch! Bitte veruche es nochmal")
        }
    }
    while (true) {
        try {
        } catch (ex: Exception) {
            println("Die eingabe war falsch. Bitte versuche es nochmal")
        }
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
        //Kassenbon ausdrucken.
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

//-> Mitarbeiter Preise/ware änder können.//habe ich leider zeitlich nicht geschafft! :(
