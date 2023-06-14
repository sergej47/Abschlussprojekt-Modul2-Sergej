import classes.*


fun main (){

    // Erstellte /Personen/ Kunden:
    var person1 = Person("David","Schulz", 2200.58,123456789,"User123")
    var mitarbeiter1 = Mitarbeiter("Ranko","Grotte", 2050.28,987654321,"User321")
    var person3 = Person("Siggi","Würdich", 2070.68,123456789, "User123")
    var mitarbeiter = Mitarbeiter("Danger","Stein", 2300.98,987654321,"User321")

    println("Willkommen in unserem geschäft! wir habe Textilien und schmuck anzubieten!")
    person1.anmeldung()
    println("Welche der artikel möchten sie wählen?:")
    println("Wir haben zu auswahl:")
    //Kleidungsstücke
    // ich möchte hier statt dieser liste eine mit index wo man die nummer wählen kann!
    println("----------------------------------------")
    val kleidungsstueck1 = Kleidungsstueck("Shorts","XL",17.99,"Blau",2)
    println("Art: ${ kleidungsstueck1.produktArt}, Größe: ${kleidungsstueck1.groesse}, Preis: ${kleidungsstueck1.preis}, Farbe; ${kleidungsstueck1.farbe}, Anzahl: ${kleidungsstueck1.anzahl}")
    println("----------------------------------------")
    val kleidungsstueck2 = Kleidungsstueck("T-Shirt","M",8.95,"rot",3)
    println("Art: ${ kleidungsstueck2.produktArt}, Größe: ${kleidungsstueck2.groesse}, Preis: ${kleidungsstueck2.preis}, Farbe: ${kleidungsstueck2.farbe}, Anzahl: ${kleidungsstueck2.anzahl}")
    println("----------------------------------------")
    val kleidungsstueck3 = Kleidungsstueck("Joggis","M",7.99,"Schwarz",5)
    println("Art: ${ kleidungsstueck3.produktArt}, Größe: ${kleidungsstueck3.groesse}, Preis: ${kleidungsstueck3.preis}, Farbe: ${kleidungsstueck3.farbe}, Anzahl: ${kleidungsstueck3.anzahl}")
    println("----------------------------------------")
    val kleidungsstueck4 = Kleidungsstueck("Jeans","L",14.95,"Schwarz",3)
    println("Art: ${ kleidungsstueck4.produktArt}, Größe: ${kleidungsstueck4.groesse}, Preis: ${kleidungsstueck4.preis}, Farbe: ${kleidungsstueck4.farbe}, Anzahl: ${kleidungsstueck3.anzahl}")


}