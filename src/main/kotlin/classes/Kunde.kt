package classes

open class Kunde(
        name: String,
        nachname: String,
        konto: Double,
        iD: Int,
        passwort: String,

        ) : Person(name, nachname, konto, iD, passwort) {

    var produktList: MutableList<Produkt> = mutableListOf()
    var warenkorb: MutableList<Produkt> = mutableListOf()
    override fun anmeldung(): Boolean {
        return super.anmeldung()
    }

    fun rezisionSchreiben() {


    }

   open fun kaufen(produkt: Produkt) {

        if (anmeldung()) {
            produktList?.forEach {
                println("${produkt.produktArt} ${produkt.groesse} ${produkt.preis} ${produkt.farbe} ${produkt.anzahl}")
            }
            warenkorb?.add(produkt)
        } else {
            println("Produkt ist leider nicht verfügbar.")
        }
    }

    override fun einkaufsliste(produkt: Produkt) {
        super.einkaufsliste(produkt)

    }

    fun shoppen() {

    }

    open fun wahreAuswahl(list: MutableList<Kleidungsstueck>): Kleidungsstueck {

        var index = 1
        for (wahre in list) {
            println("$index, $wahre")
            index++
        }
        var imput = readln().toInt()
        var eingegebeneWahre = list[imput-1]


        println("Sie haben sich fü die $eingegebeneWahre entschieden gute wahl!")
        warenkorb.add(eingegebeneWahre)
        list.removeAt(imput)
        return eingegebeneWahre


    }

}
