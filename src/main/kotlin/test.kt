import classes.*

// Erstellten von /Personen/ Kunden:
var person1 = Kunde("David", "Schulz", 2200.58, 123467, "user123")
var person2 = Kunde("Siggi", "Würdich", 2070.68, 1234565, "user123")
var kundenliste: MutableList<Person> = mutableListOf(
        person1,
        person2
)

fun main() {

    // Einführung.
    println("Willkommen in unseren Geschäft! wir habe Textilien und schmuck anzubieten!")
    // Anmeldungsvogang
    person1.anmeldung()


    println("Welche der artikel möchten sie wählen?:")
    println("Wir haben zu auswahl:")
    println("----------------------------------------")
        // Vorstellung der wahre.
    do {
        //Store vorstellung und Einkauf
        var store = Store()
        //Den Kleidungsstücken einen index geben.
        //Kleidungsstücke mit index Ausgeben lassen.
        for (i in store.kleidungsliste.indices) {
            var kleidungsstueck = store.kleidungsliste[i]
            println("${i}: Art: ${kleidungsstueck.produktArt}, Größe: ${kleidungsstueck.groesse}, Preis: ${kleidungsstueck.preis}, Farbe; ${kleidungsstueck.farbe}, Anzahl: ${kleidungsstueck.anzahl}")
        }
        println("----------------------------------------")
        println("Wählen sie ein Produkt")

        // Produktauswahl
        var index = person1.wareAuswahl(store.kleidungsliste)
        store.kleidungsliste[index].removeOne()

        //Wahre in den Warenkorb hinzufügen.
        println("-----------------------------------------")
        //Warenkorb in der konsole ausgeben lassen.
        println("In ihren wahrenkorb ist:")
        println("${person1.warenkorb}")

        println("Wollen sie mehr Wahre Wählen?")                    // Eine "if" abfrage ob der Kunde mehr Kleidung Wählen will.
        var imput = readln()
        if (imput == "9") {                                         //->(true) imput!   //Wenn der imput "1" ist bricht man den Einkauf ab und man kommt dann weiter.
            break                                                   //Wenn die zahl "1" gewält worden ist, bricht(break) die schleife den vorgang ab, und geht weiter.
        }
    } while (true)


    //Preis vom Konto Abrechnen.
    //var konto = person1.kontoStand
    //var wahrenkorbA = person1.warenkorb
    //var bezahlen = konto - person1.warenkorb
    person1.bezahlen()


    println("-----------------------------------------")
    println("Wollen sie noch ein produkt wählen?")
    //Anzeigen von Unterkategorien
    var unterketegorien = Unterkategorien()

    println("Mützen:")
    for (pair in unterketegorien.muetzen) {
        println(pairToString(pair))
    }
    println("Schmuck:")
    for (pair in unterketegorien.schmuck) {
        println(pairToString(pair))
    }

}

