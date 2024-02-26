/**
 *
 */
fun Store.startshop() {

    initDefaultData()
    load()
    amaniDunia()
    willkommen()
    enterName()
    if (!accountWithThisName) {
        enterAge()
    } else {
        age = currentUser.age
    }
    println("Du Bist $userName und bist $age Jahre alt.")
    do {
        if (age < 12) {
            println("Leider bist du zu jung! Komm wieder in ${12-age} Jahren")
            break
        }
        homeScreen()
    } while (!end)

}

fun Store.willkommen() {
    println("Willkommen im AmaniDunia Shop")
    println()
}

/**
 *
 */
fun Store.enterName() {
    println("Gib bitte deinen Namen ein")
    userName = readln()
    println("Tachchen $userName !")
    accountWithThisName = this.checkForAccount(userName)
    if (accountWithThisName) {
        currentUser = accountsMap[userName]!!
    }
}

/**
 *
 */
fun Store.checkForAccount(name: String): Boolean {

    var bool: Boolean

    if (accountNames.contains(name)) {
        println("Zu dem Namen $name gibt es in unserem Shop ein Konto")
        bool = true
    } else {
        println("Zu dem Namen $name gibt es in unserem Shop kein Konto")
        bool = false
    }
    return bool
}

/**
 *
 */
fun Store.enterAge() {
    println("Wie alt bist du ?")
    try {
        age = readln().toInt()
    } catch (e: NumberFormatException) {
        println("Bitte gib eine ganze Zahl ein als Alter ein!")
        enterAge()
    }
}