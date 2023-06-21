package classes

//Ein constructor um neue Kunden Erstellen zu können.
open class Kunde(
        name: String,
        nachname: String,
        konto: Double,
        iD: Int,
        passwort: String,

        ) : Person(name, nachname, konto, iD, passwort) {
    var warenkorb: MutableList<Produkt> = mutableListOf()



    fun einkaufsliste(produkte: MutableList<Produkt>) {                                                                      // Hier wird die Methode "einkaufsliste" Überschrieben
        for (i in produkte){
            println("${i.produktArt} ${i.groesse} ${i.anzahl} ${i.preis} ${i.farbe}")
        }

    }


    //Bezahl Funktion Preis vom Kontostand abrechnung.
    open fun bezahlen(): Double {
        var gesammtPreis = 0.0                                                                                          //Hier ist der gesamtpreis noch auf (0) gestellt
        for (element in warenkorb) {                                                                                    //Das element im warenkorb
            gesammtPreis += element.preis                                                                               // Der gesamtPreis vom warenkorb + der element preis = gesamtsumme.
        }
        if (kontoStand < gesammtPreis) {                                                                                // wenn der kontostand kleiner als der gesamt preis, dann geht die schleife auf else!
            println("Dein kontostand reicht für den einkauf nicht aus!")

        } else {
            var newKonto = kontoStand - gesammtPreis                                                                    // Neues kontostand mit abrechnung des preises.
            kontoStand = newKonto                                                                                       // Neuen wert dem konto zuweisen!
        }
        return gesammtPreis                                                                                             //Lassen uns den gesamtwert als (Double wert) Wiedergeben.
    }
}


