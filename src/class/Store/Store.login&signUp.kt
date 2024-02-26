/**
 *
 */
fun Store.signUp() {
    println("* * * SignUp View * * *")
    println("Passwort hier drunter eingeben")
    val password: String = readln()
    println("Bitte bestätige dein Passwort")
    if (password == readln()) {
        println("Passwort bestätigt")
        println("Verknüpfe nun dein Bank Konto mit der App.")
        UserAccount(userName,password,age,connectBank(), cart)
        println("Jetzt kannst du Dich einloggen")
        logInUser()
    } else {
        wrongAnswer()
        signUp()
    }
}

fun Store.logInUser() {
    println("$userName bitte gib dein Passwort ein")
    if (readln() == accountsMap[userName]?.passwort) {
        currentUser = accountsMap[userName]!!
        currentUser.loggedIn = true
        println("Du wurdest erfolgreich eingeloggt")
        emptyCartInit()
        storeProducts()

    } else {
        println("Falsches Passwort! Erneut versuchen? $enter")
        if (readln() == "") {
            logInUser()
        }
    }
}

fun Store.connectBank(): Double {
    println("Wie viel Geld hast du auf deinem Konto?")
    var cashConnect: Double
    try {
        cashConnect = readln().toDouble()
    } catch (e: NumberFormatException) {
        println("Fehler: $e")
        println("Bitte gib eine Zahl ein")
        connectBank()
        cashConnect = 0.0
    }

    return cashConnect
}