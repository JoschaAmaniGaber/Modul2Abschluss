fun Store.homeScreen() {

    println("* * * Home Screen * * *")
    println("Was möchtest du tun $userName ?")
    println("Drücke die jeweilige Taste für die zugehörige Aktion & $enter")
    stringNumber("1")
    println("um alle Accounts einzusehen")
    stringNumber("2")
    println("um alle Produkte einzusehen")

    if (!currentUser.loggedIn) {
        stringNumber("3")
        println("Sign Up")
        if (!currentUser.loggedIn && accountWithThisName) {
            stringNumber("4")
            println("Log In")
        }
    }

    if (currentUser.loggedIn && !currentUser.isAdmin) {
        stringNumber("5")
        println("um Produkte zu kaufen")
        stringNumber("6")
        println("um deinen Warenkorb einzusehen")
        stringNumber("7")
        println("um Produkte zu sortieren")
        stringNumber("8")
        println("um Produkte zu filtern")
        stringNumber("9")
        println("um dein Konto einzusehen")
    }
    if (currentUser.loggedIn) {
        stringNumber("000")
        println("um dich auszuloggen und zum Beenden des Programms")
    }

    if (currentUser.isAdmin && currentUser.loggedIn) {
        stringNumber("admin")
        println("um in den ADMIN SHOP zu kommen")
    }
    homeScreenChoice()
}

fun Store.homeScreenChoice() {
    when (readln()) {

        //  Accounts sehen
        "1" -> showAccounts()

        // Karte anzeigen & zurück zum HomeScreen
        "2" -> showProducts()

        // Sign Up
        "3" -> signUpCheck()

        // Log In
        "4" -> logInCheck()

        // Produkte kaufen
        "5" -> addToCart()

        // Warenkorb einsehen
        "6" -> showCartAndPay()

        // Produkte sortieren
        "7" -> sort()

        // Produkte Filtern
        "8" -> filter()


        // Profil Einsehen Funktion
        "9" -> {
            if (currentUser.loggedIn && !currentUser.isAdmin) {
                println(currentUser)
            } else println("Du bist noch nicht eingeloggt oder du bist ein Admin")
        }

        // Log Out Funktion
        "000" -> logOut()

        // Admin Shop
        "admin" -> checkAdminShop()

        // Falsche Eingabe Funktion
        else -> {
            wrongAnswer()
            load()
        }
    }
}

private fun Store.checkAdminShop() {
    if (currentUser.isAdmin && currentUser.loggedIn) {
        adminShop()
    } else println("Du bist kein Admin oder nicht eingeloggt")
}

fun Store.logOut() {
    if (currentUser.loggedIn) {
        currentUser.loggedIn = false
    } else println("Du bist noch nicht eingeloggt")
    println("Möchtest du das Programm Beenden, dann gib >>> stop <<< ein & $enter")
    if (readln() == "stop") end = true
}

fun Store.logInCheck() {
    if (!currentUser.loggedIn) {
        logInUser()
    } else println("Du bist schon eingeloggt")
}

fun Store.signUpCheck() {
    if (accountWithThisName) {
        println("Du möchtest dich mit einem anderen Namen registrieren, Dann gib jetzt deinen Namen ein. Hier sind die schon vergebenen Namen")
        accountNames.forEach { println("$it ist schon weg") }
        enterName()
        if (accountsMap.keys.contains(userName)) {
            println("Möchtest du direkt weiter zum Login $enter")
            if (readln() == "") {
                logInUser()
            }
        }
    }
    if (!currentUser.loggedIn) {
        signUp()
    } else println("Du bist schon eingeloggt")
}

fun Store.wrongAnswer() {
    println("Ungültige Eingabe")
    println("Probiers nochmal")
}