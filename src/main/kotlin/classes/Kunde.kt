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

    fun rezisionSchreiben() {


    }



    override fun einkaufsliste(produkt: Produkt) {               // Hier wird die Methode "einkaufsliste" Überschrieben
        super.einkaufsliste(produkt)

    }


    //Bezahl Funktion Preis vom Kontostand abrechnung.
    open fun bezahlen(): Double {
        var gesammtPreis = 0.0
        for (element in warenkorb) {                                  //Das element im warenkorb
            gesammtPreis += element.preis                            // Der gesammtPreis vom warenkorb + dar element preis
        }
        if (kontoStand < gesammtPreis) {                           // wenn der kontostand kleiner als der gesammt preis, dann geht die schleife auf else!
            println("Dein kontostand reicht für den einkauf nicht aus!")

        } else {
            var newKonto = kontoStand - gesammtPreis              // Neues kontostand mit abrechnung des preises.
            kontoStand = newKonto                                // Neuen wert dem konto zuweisen!
        }
        return gesammtPreis
    }
}


