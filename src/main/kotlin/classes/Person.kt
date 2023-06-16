package classes

import kundenliste

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


        while (!logged) {
            println("Bitte hier einmal Anmelden:")
            println("ihr Name Bitte?:")
            var eingabeName = readln()
            println("Hallo $eingabeName")


            // Passwortabfrage.
            var versuche = 0
            println("geben sie ihr Passwort ein:")
            var pw: String? = readln()
            //Fragt ab, ob eingegebener passwort und der name übereinstimmt
            var resoult = kundenliste.find { it.name == eingabeName && it.passwort == pw }
            if (resoult != null) {
                logged = true
                println("Willkommen in unserem Store!")
            } else if (versuche == 3) {
                println("Sie haben versucht einzuloggen, Bitte versuchen sich es später noch einmal.")
                versuche = 0
            }else{
                println("Ihre daten stimmen nicht überein, bitte versuche es später nochmal.")
                versuche = 0
            }
            versuche++ // + 1 versuch
        }
        return logged
    }


}