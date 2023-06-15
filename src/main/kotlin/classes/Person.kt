package classes

open class Person(
    val name: String,
    val nachname: String,
    var kontoStand: Double,
    var iD: Int,
    var passwort: String,
    var logged: Boolean = false

) {
    open fun einkaufsliste(produkt: Produkt) {
        var wahrenkorb: List<Produkt> = listOf()
    }

   open fun anmeldung(): Boolean {

        println("Bitte hier einmal Anmelden:")
        println("Name?:")
        var eingabeName = readln()
        println("Hallo $eingabeName")


        // Passwortabfrage.
        var versuche = 0

        while (versuche < 5 && !logged) {
            println("geben sie ihr Passwort ein:")
            var pw: String? = readln()
            if (pw != null) {
                logged = true
            } else {
                println("Falsches Passwort. Versuch sie es noch einmal")
                versuche++ // + 1 versuch
            }
        }
        return logged
    }


}