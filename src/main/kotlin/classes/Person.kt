package classes


//Erstellen einer Neuen person (Constructor)
open class Person(
        val name: String,
        val nachname: String,
        var kontoStand: Double,
        var iD: Int,
        var passwort: String,
        var logged: Boolean = false

) {

}