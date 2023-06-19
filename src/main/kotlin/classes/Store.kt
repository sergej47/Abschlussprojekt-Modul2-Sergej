package classes

open class Store {

    val kleidungsstueck1 = Kleidungsstueck("Shorts", "XL", 17.99, "Blau", 2)

    val kleidungsstueck2 = Kleidungsstueck("T-Shirt", "M", 8.95, "rot", 3)

    val kleidungsstueck3 = Kleidungsstueck("Joggis", "M", 7.99, "Schwarz", 5)

    val kleidungsstueck4 = Kleidungsstueck("Jeans", "L", 14.95, "Schwarz", 3)

    var kleidungsliste: MutableList<Kleidungsstueck> = mutableListOf(
            kleidungsstueck1,
            kleidungsstueck2,
            kleidungsstueck3,
            kleidungsstueck4
    )

}

