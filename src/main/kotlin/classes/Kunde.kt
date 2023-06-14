package classes

open class Kunde (
    name: String,
    nachname: String,
    konto: Double,
    iD: Int,
    passwort: String,
    var produktList: MutableList<Produkt>?,
    var warenkorb: MutableList<Produkt>?
): Person(name,nachname,konto,iD,passwort){


    override fun anmeldung(): Boolean {
        return super.anmeldung()
    }

    fun rezisionSchreiben(){


    }

    fun kaufen(produkt: Produkt){

        if (anmeldung()){
            produktList?.forEach {
                println("${produkt.produktArt} ${produkt.groesse} ${produkt.preis} ${produkt.farbe} ${produkt.anzahl}")
            }
            warenkorb?.add(produkt)
        }else{
            println("Produkt ist leider nicht verfügbar.")
        }
    }

    override fun einkaufsliste(produkt: Produkt) {
        super.einkaufsliste(produkt)
    }

    fun shoppen(){

    }

}
