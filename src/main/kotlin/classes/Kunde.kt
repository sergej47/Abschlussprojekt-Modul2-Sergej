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

    override fun einkaufsliste(produkt: Produkt) {          // Hier wird die Methode "einkaufsliste" Überschrieben
        super.einkaufsliste(produkt)

    }

    open fun wareAuswahl(list: MutableList<Kleidungsstueck>): Int {

        var imput = readln().toInt()                //-> Eingabe mit integer(zahl) welche ware man haben will.
        var eingegebeneWahre = list[imput - 1]


        println("Sie haben sich für die $eingegebeneWahre entschieden,gute Wahl!")
        warenkorb.add(eingegebeneWahre)            // Die ware zu warenkorb hinzufügen!

        return imput                              // Hier wird der eingegebene "imput" Wiedergegeben


    }

    open fun bezahlen() {
        var gesammtPreis = 0.0
        for (element in warenkorb) {
            gesammtPreis += element.preis
        }
        if (kontoStand < gesammtPreis) {
            println("Dein kontostand reicht für den einkauf nicht aus!")

        } else {
            var newKonto = kontoStand - gesammtPreis
            kontoStand = newKonto
        }

        println("Dein konto beträgt jetzt $kontoStand")
    }
}


