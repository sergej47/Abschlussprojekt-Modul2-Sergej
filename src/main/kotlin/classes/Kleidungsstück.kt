package classes

//constructor um Kleidungsstücke zu Erstellen.
class Kleidungsstueck(
        produktart: String, groesse: String,
        preis: Double, farbe: String, anzahl: Int
) : Produkt(produktart, groesse, preis, farbe, anzahl) {

    override fun toString(): String {                                                                                   //bearbeitet die inhalte und macht sie in der konsole zum String.
        return "Größe: $groesse, Preis: $preis, Art: $produktArt, Farbe: $farbe, Anzahl: $anzahl"
    }

}


