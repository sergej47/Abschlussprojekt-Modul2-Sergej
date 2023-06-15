package classes

open class Mitarbeiter (
    name: String,
    nachname: String,
    kontoStand: Double,
    iD: Int,
    passwort: String,
    logged: Boolean = true
): Person(name,nachname,kontoStand,iD,passwort,logged) {

    //Mitarbeiter Erstellen
    var mitarbeiter1 = Mitarbeiter("Ranko", "Grotte", 2050.28, 987654321, "User321")
    var mitarbeiter = Mitarbeiter("Danger", "Stein", 2300.98, 987654321, "User321")

    //Mitarbeiter Liste erstellen
    var mitarbeiterListe: MutableList<Person> = mutableListOf(
            mitarbeiter,
            mitarbeiter1
    )
}