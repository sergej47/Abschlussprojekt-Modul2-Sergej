import classes.Person

fun anmeldung() {
    println("${person1.name}")

    println("Bitte hier einmal Anmelden:")
    println("Name?:")
    var eingabeName = readln()
    println("Hallo $eingabeName")
    println("Super! und jetzt $eingabeName brauchen wir dein Nachnamen:")
    var eingabeNachname = readln()
    println("Geben sie das ID vom konto an:")
    var eingabeKonto = readln().toInt()

    // Passwortabfrage.
    var versuche = 0
    var userLoggedIn = false

    while (versuche < 5 && !userLoggedIn) {
        println("geben sie ihr Passwort ein:")
        var pw = readln()
        if (pw == "User123") {
            userLoggedIn = true
        } else {
            println("Falsches Passwort. Versuch sie es noch einmal")
            versuche++ // versuche = versuche + 1
        }
    }

}