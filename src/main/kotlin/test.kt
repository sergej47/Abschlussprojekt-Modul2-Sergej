import classes.*

// Erstellten von /Personen/ Kunden:
var person1 = Kunde("David", "Schulz", 2200.58, 123467, "user123")
var person2 = Kunde("Siggi", "Würdich", 2070.68, 1234565, "user123")
var kundenliste: MutableList<Person> = mutableListOf(
        person1,
        person2
)

fun main() {

    //Einführung.
    println("Willkommen in unserem geschäft! wir habe Textilien und schmuck anzubieten!")
    person1.anmeldung()
    println("Welche der artikel möchten sie wählen?:")
    println("Wir haben zu auswahl:")
    println("----------------------------------------")

    do {
        //Store vorstellung und Einkauf
        var store = Store()
        //Den Kleidungsstücken einen index geben.
        for (i in store.kleidungsliste.indices) {
            var kleidungsstueck = store.kleidungsliste[i]
            println("${i}: Art: ${kleidungsstueck.produktArt}, Größe: ${kleidungsstueck.groesse}, Preis: ${kleidungsstueck.preis}, Farbe; ${kleidungsstueck.farbe}, Anzahl: ${kleidungsstueck.anzahl}")
        }
        println("----------------------------------------")
        println("Wählen sie ein Produkt")

        // Produktauswahl
        var index = person1.wahreAuswahl(store.kleidungsliste)
        store.kleidungsliste[index].removeOne()

                //Wahre in den Wahrenkortb hinzufügen.
        //person1.warenkorb.add(auswahl)
        println("-----------------------------------------")
        println("In ihren wahrenkorb ist:")
        println("${person1.warenkorb}")

        println("Wollen sie mehr Wahre Wählen?")
        var imput = readln()
        if (imput == "1") {
            break
        }
        //Preis vom Konto Abrechnen.
        //var neuerKotostand = person1.warenkorb[] -

    } while (true)
    println("-----------------------------------------")
    println("Wollen sie noch ein produkt wählen?")
    //Anzeigen un Unterkategorien
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

