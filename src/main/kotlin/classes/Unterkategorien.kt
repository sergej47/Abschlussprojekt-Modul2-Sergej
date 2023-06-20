package classes

open class Unterkategorien (produktArt: String,groesse: String,preis: Double,farbe: String,anzahl: Int ): Produkt(produktArt,groesse,preis,farbe,anzahl){



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


/*println("Mützen:")
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

 */