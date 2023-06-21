package classes

//Erstellen von Mitarbeiter (constructor)
open class Mitarbeiter(
        name: String,
        nachname: String,
        kontoStand: Double,
        iD: Int,
        passwort: String,
        logged: Boolean = true
) : Person(name, nachname, kontoStand, iD, passwort, logged) {



}
