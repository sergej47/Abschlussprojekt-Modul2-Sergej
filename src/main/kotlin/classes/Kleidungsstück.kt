package classes

class Kleidungsstueck (
    produktart: String, groesse: String,
    preis: Double, farbe: String, anzahl: Int
): Produkt(produktart,groesse, preis, farbe, anzahl) {


    fun rezensionAnzeigen(){

    }

    override fun toString(): String {
        return "Größe: $groesse, Preis: $preis, Art: $produktArt, Farbe: $farbe, Anzahl: $anzahl"
    }
}


