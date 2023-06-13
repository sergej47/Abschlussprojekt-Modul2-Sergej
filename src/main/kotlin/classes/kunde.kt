package classes

class kunde (
    name: String,
    nachname: String,
    konto: Double,
    iD: Int,
    passwort: String
): Person(name,nachname,konto,iD,passwort){



    fun rezisionSchreiben(){


    }

    fun kaufen(produkt: Produkt){

    }

    override fun einkaufsliste(produkt: Produkt) {
        super.einkaufsliste(produkt)
    }

    fun wahrenkorb(){

    }

}
