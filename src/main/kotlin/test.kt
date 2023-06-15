import classes.*


fun main() {

    // Erstellte /Personen/ Kunden:
    var person1 = Kunde("David", "Schulz", 2200.58,123467,"user123")
    var person2 = Kunde("Siggi", "Würdich", 2070.68,1234565,"user123")
    var kundenliste: MutableList<Person> = mutableListOf(
            person1,
            person2
    )
    println("Willkommen in unserem geschäft! wir habe Textilien und schmuck anzubieten!")
    person1.anmeldung()
    println("Welche der artikel möchten sie wählen?:")
    println("Wir haben zu auswahl:")
    //Kleidungsstücke
    // ich möchte hier statt dieser liste eine mit index wo man die nummer wählen kann!
    println("----------------------------------------")

    println("----------------------------------------")

    var store = Store()
    store.kleidungsliste
    //Den Kleidungsstücken einen index geben.
    for (i in store.kleidungsliste.indices){
        var kleidungsstueck = store.kleidungsliste[i]
        println("${i}: Art: ${kleidungsstueck.produktArt}, Größe: ${kleidungsstueck.groesse}, Preis: ${kleidungsstueck.preis}, Farbe; ${kleidungsstueck.farbe}, Anzahl: ${kleidungsstueck.anzahl}")
    }
    println("----------------------------------------")
    println("Wählen sie ein Produkt")

    // Produktauswahl
    var auswahl = person1.wahreAuswahl(store.kleidungsliste)

    //Wahre in den Wahrenkortb hinzufügen.
    person1.warenkorb.add(auswahl)


}

