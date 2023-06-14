package classes

class Kleidungsstueck (
    produktart: String, groesse: String,
    preis: Double, farbe: String, anzahl: Int
): Produkt(produktart,groesse, preis, farbe, anzahl) {


    fun rezensionAnzeigen(){

    }

    var kleidungsListe: MutableMap<String,Double> = mutableMapOf()
}


