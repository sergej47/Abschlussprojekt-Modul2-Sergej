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
    do {                                                                        // Eine do/while schleife, um den Einkauf dem kunden zu ermöglichen
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
        var index = person1.wareAuswahl(store.kleidungsliste)                   // Eine Eingabe Funktion mit einem index
        store.kleidungsliste[index].removeOne()                                 // Die funktion löscht das element aus der liste.

        //Wahre in den Warenkorb hinzufügen.
        println("-----------------------------------------")
        //Warenkorb in der konsole ausgeben lassen.
        println("In ihren wahrenkorb ist:")
        println("${person1.warenkorb}")

        println("Wollen sie weitere Wahre Wählen?")                             // Eine "if" abfrage ob der Kunde mehr Kleidung Wählen will.
        var imput = readln()
        if (imput == "9") {                                                     //->(true) imput!   //Wenn der imput "1" ist bricht man den Einkauf ab und man kommt dann weiter.
            break                                                               //Wenn die zahl "1" gewält worden ist, bricht(break) die schleife den vorgang ab, und geht weiter.
        }
    } while (true)


    //Preis vom Konto Abrechnen.
    person1.bezahlen()                                                          //Bezahl Funktion.


    println("-----------------------------------------")
    println("Wollen sie noch ein weiteres produkt wählen?")
    //Anzeigen von Unterkategorien
    var unterketegorien = Unterkategorien()

    println("Mützen:")
    var index = 0
    for (key in unterketegorien.muetzen.keys.toList()) {
        println("$index: $key, ${unterketegorien.muetzen[key]}")
        index++
    }
    println("Schmuck:")
    for (pair in unterketegorien.schmuck) {
        println(pairToString(pair))
    }
    var eingabe = readln().toInt()
    var auswahlKey = unterketegorien.muetzen.keys.toList()[eingabe]              //Speichert den namen "key" der ausgewählt worden ist.
    var preis = unterketegorien.muetzen[auswahlKey]                              //speichert den preis "Value" der auswahl ab.
    println("ihre auswahl war $auswahlKey $preis")
    //Warenkorb.
    person1.warenkorb.add()

}

