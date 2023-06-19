package classes

open class Unterkategorien(produktArt: String, groesse: String, preis: Double, farbe: String, anzahl: Int) : Produkt(produktArt, groesse, preis, farbe, anzahl) {


    // Die 1te Unterkategorie.
    var uhr = Unterkategorien("Uhr", "M", 19.99, "Schwarz", 5)
    var armband = Unterkategorien("Armband", "S", 4.99, "Grün", 4)
    var kette = Unterkategorien("kette", "L", 24.95, "Gold", 7)

    //Die 2te Unterkategorie.
    var cap = Unterkategorien("Cap", "XL", 7.99, "Rot", 10)
    var mütze1 = Unterkategorien("Mütze", "XL", 7.99, "Gelb", 8)
    var mütze2 = Unterkategorien("Mütze", "XL", 7.99, "Blau", 6)

    var unterkategorienListe: MutableList<Unterkategorien> = mutableListOf(
            uhr,
            armband,
            kette,
            cap,
            mütze1,
            mütze2
    )
}
// Umschreiben in eine Liste mit Parametern! Erleichtert dir das Arbeiten!
// Eine neue Klasse mit dem namen "Schmuck" erstellen und von Produkt erben lassen.

//var schmuck: MutableMap<String,Double> = mutableMapOf(
//    "Uhr" to 19.99,
//    "Armband" to 4.99,
//    "Kette" to 5.99
//)
//var muetzen: MutableMap<String,Double> = mutableMapOf(
//    "cap" to 7.99,
//    "Schwarze Mütze" to 6.99,
//    "Blaue Mütze" to 8.99
//)


