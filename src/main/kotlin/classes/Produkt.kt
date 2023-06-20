package classes

open class Produkt (
    var produktArt: String,
    var groesse: String,
    var preis: Double,
    var farbe: String,
    var anzahl: Int
) {
    //Produkt Remove Methode/Funktion
    fun removeOne(){
        this.anzahl--
    }
}