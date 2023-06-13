package classes

open class Person(
    val name: String,
    val nachname: String,
    var konto: Double,
    private var iD: Int,
    private var passwort: String,

    var vorhandenenKunden: MutableList<String>

)

{
    open fun einkaufsliste(produkt: Produkt) {
        var wahrenkorb: List<Produkt> = listOf()
    }
   init {
        var person1 = Person("David","Schulz", 2200.58,iD,passwort)
        var person2 = Person("Ranko","Grotte", 2050.28,iD, passwort)
        var person3 = Person("Siggi","Schlecht", 2070.68,iD, passwort)
        var person4 = Person("Danger","Stein", 2300.98,iD, passwort)
    }


}