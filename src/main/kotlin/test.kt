import classes.*


fun main() {
    var store = Store()
    // Einführung.
    println("Willkommen in unseren Geschäft! wir habe Textilien und schmuck anzubieten!")

    // Anmeldungsvogang
    //Kundenanmeldung und abspeichern.
    var kunde = store.anmeldung()
    var mitarbeiter = store.anmeldung()

    while (true) {
        println("Welche der artikel möchten sie wählen?:")
        println("Wir haben zu auswahl:")
        println("----------------------------------------")
        // Vorstellung der wahre & Einkauf mit einer (do-while-schleife)
        do {                                                                        // Eine do/while schleife, um den Einkauf dem kunden zu ermöglichen
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
            var index = store.wareAuswahlKleidung(kunde)                                         // Eine Eingabe Funktion mit einem index
            store.kleidungsliste[index].removeOne()                                 // Die funktion löscht das element aus der liste.

            //Wahre in den Warenkorb hinzufügen.
            println("-----------------------------------------")
            //Warenkorb in der konsole ausgeben lassen.
            println("In ihren wahrenkorb ist:")
            println("${kunde.warenkorb}")

            println("Wollen sie weitere Wahre Wählen?")                             // Eine "if" abfrage ob der Kunde mehr Kleidung Wählen will.
            var imput = readln()
            if (imput == "9") {                                                     //->(true) imput!   //Wenn der imput "1" ist bricht man den Einkauf ab und man kommt dann weiter.
                break                                                               //Wenn die zahl "1" gewält worden ist, bricht(break) die schleife den vorgang ab, und geht weiter.
            }
        } while (true)


        //Preis vom Konto Abrechnen.
        kunde.bezahlen()                                                          //Bezahl Funktion.
        println("Sie haben noch ${kunde.kontoStand}€ auf ihrem Konto")

        println("-----------------------------------------")
        println("Wollen sie noch ein weiteres produkt wählen?")

        //Anzeigen von Unterkategorien // habe es umgebaut muss es morgen zu Ende Coden.

        do {                                                                        // Eine do/while schleife, um den Einkauf dem kunden zu ermöglichen.
            //der Produktliste einen index geben.
            //Produktliste mit index Ausgeben lassen.
            for (i in store.produktListe.indices) {
                var zubehör = store.produktListe[i]
                println("${i}: Art: ${zubehör.produktArt}, Größe: ${zubehör.groesse}, Preis: ${zubehör.preis}, Farbe; ${zubehör.farbe}, Anzahl: ${zubehör.anzahl}")
            }
            println("----------------------------------------")
            println("Wählen sie ein Produkt")

            // Produktauswahl
            var index = store.wareAuswahlProdukt(kunde)                                   // Eine Eingabe Funktion mit einem index
            store.produktListe[index].removeOne()                                 // Die funktion löscht das element aus der liste.

            //Wahre in den Warenkorb hinzufügen.
            println("-----------------------------------------")
            //Warenkorb in der konsole ausgeben lassen.
            println("In ihren wahrenkorb ist:")
            for (arikel in kunde.warenkorb) {
                println("${arikel.produktArt} ${arikel.preis} ${arikel.anzahl}")
            }


            println("Wollen sie weitere Wahre Wählen?")                             // Eine "if" abfrage ob der Kunde mehr Kleidung Wählen will.
            var imput = readln()
            if (imput == "9") {                                                     //->(true) imput!   //Wenn der imput "1" ist bricht man den Einkauf ab und man kommt dann weiter.
                break                                                               //Wenn die zahl "1" gewält worden ist, bricht(break) die schleife den vorgang ab, und geht weiter.
            }
        } while (true)

        kunde.bezahlen()                                                          //Bezahl Funktion.
        println("Vielen Dank für ihren einkauf!Der Kassenbon wird gedruckt bitte warten!")

        //Kassenbon Ausdrucken:
        println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
        println("-------------receipt------------")
        for (artikel in kunde.warenkorb) {
            println("|Your shopping cart:: ${artikel.produktArt}")
        }
        println("""
        |You have paid:       ${kunde.bezahlen()}
        |*************
        |Payment Finished!
        |Remaining credit:    ${kunde.kontoStand}
        |---------Thank´s for Payment!---------
    """.trimMargin())
        println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    } //Schleife Ende -> ist aber falsch
    println("wollen sie sich ausloggel?")
    // Logaut.
    // Mitarbeiter Preise/ware änder können.
}

