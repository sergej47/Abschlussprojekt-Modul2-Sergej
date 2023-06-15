import classes.*


fun main() {

    // Erstellte /Personen/ Kunden:
    var person1 = Person("David", "Schulz", 2200.58,123467,"user123")
    var mitarbeiter1 = Mitarbeiter("Ranko", "Grotte", 2050.28, 987654321, "User321")
    var person3 = Person("Siggi", "Würdich", 2070.68,1234565,"user123")
    var mitarbeiter = Mitarbeiter("Danger", "Stein", 2300.98, 987654321, "User321")

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
    //var wahre = Store().wahreAuswahl(store.wahreAuswahl())

    store.wahreAuswahl()


}

