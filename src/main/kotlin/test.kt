import classes.Kleidungsstueck
import classes.Person


fun main (){
    println("Willkommen in unserem geschäft!")
    anmeldung()
    println("Welche der artikel möchten sie wählen?:")
    println("Wir haben zu auswahl:")
    val kleidungsstueck1 = Kleidungsstueck("Shorts","XL",17.99,"Blau")
    println("${ kleidungsstueck1.produktArt} ${kleidungsstueck1.groesse} ,${kleidungsstueck1.preis}, ${kleidungsstueck1.farbe}")
    val kleidungsstueck2 = Kleidungsstueck("T-Shirt","M",8.95,"rot")
    println("${ kleidungsstueck2.produktArt} ${kleidungsstueck2.groesse} ,${kleidungsstueck2.preis}, ${kleidungsstueck2.farbe}")
    val kleidungsstueck3 = Kleidungsstueck("Joggis","M",7.99,"Schwarz")
    println("${ kleidungsstueck3.produktArt} ${kleidungsstueck3.groesse} ,${kleidungsstueck3.preis}, ${kleidungsstueck3.farbe}")
    val kleidungsstueck4 = Kleidungsstueck("Jeans","L",14.95,"Schwarz")
    println("${ kleidungsstueck4.produktArt} ${kleidungsstueck4.groesse} ,${kleidungsstueck4.preis}, ${kleidungsstueck4.farbe}")


}