/**
 *
 */
fun Store.adminShop() {
    if (currentUser.loggedIn && currentUser.isAdmin) {
        println("* * * ADMIN SHOP * * *")
        stringNumber("1")
        println("Produkt hinzufügen")
        stringNumber("2")
        println("Produkt nachbestellen")
        stringNumber("3")
        println("Produkt löschen")
        when (readln()) {

            "1" -> addProduct()

            "2" -> refillProduct()

            "3" -> deleteProduct()

        }
    } else println("Du bist entweder nicht eingeloggt oder bist kein Admin")
}

/**
 *
 */
fun Store.addProduct() {
    println("Du möchtest ein neues Produkt hinzufügen")
    println("Gib einen Namen für das Produkt ein.")
    productName = readln()
    if (productsName.contains(productName)) {
        println("Produkt schon vorhanden")
        wrongAnswer()
        addProduct()
    } else {
        println("Was soll das Produkt kosten?")
        try {
            price = readln().toDouble()
        } catch (e: Exception) {
            println("Fehler: $e")
            wrongAnswer()
            addProduct()
        }
        println("Aus welcher Gruppe soll das Product sein?")
        i = 0
        productGroup.forEach {
            i++
            stringNumber("$i")
            println(it)
        }
        when (readln()) {

            "1" -> addSoftDrink()

            "2" -> addHotDrink()

            "3" -> addMenu()

            "4" -> addMainCourse()

        }
    }

}

/**
 *
 */
fun Store.addMainCourse() {
    println("Gib eine Beilage ein")
    MainCourse(productName, price, 0 ,readln())
}

/**
 *
 */
fun Store.addMenu() {
    Menu(productName,price, 0)
}

/**
 *
 */
fun Store.addHotDrink() {
    HotDrink(productName,price,0)
}

/**
 *
 */
fun Store.addSoftDrink() {
    println("Und welche Größe soll es haben trennen deine eingabe durch einen Punkt")
    try {
        SoftDrink(productName, price, readln().toDouble(), 0)
    } catch (e: Exception) {
        println("Fehler: $e")
        wrongAnswer()
        addSoftDrink()
    }
}

/**
 *
 */
fun Store.refillProduct() {
    println("Welches Produkt möchtest du nachbestellen")
    showProductsAdmin()
    // TODO: Produkt Auswahl und erhöhen um Anzahl
    try {
        var refillIndex: Int = readln().toInt()
        println("Von dem Produkt ${products[refillIndex].name} sind noch ${products[refillIndex].quantity} Stück vorhanden")
        println("Wieviele möchtest du nachbestellen")
        products[refillIndex].quantity += readln().toInt()
        println("Jetzt hast du ${products[refillIndex].quantity} in deinem Lager.")
    } catch (e: Exception) {
        println("Fehler: $e")
        wrongAnswer()
        refillProduct()
    }
}

/**
 *
 */
fun Store.deleteProduct() {
    println("Welches Produkt möchtest du löschen?")
    showProductsAdmin()
    try {
        var deleteIndex: Int = readln().toInt()
        products.removeAt(deleteIndex)
    } catch (e: Exception) {
        println("Fehler: $e")
        wrongAnswer()
        deleteProduct()
    }
}

/**
 *
 */
fun Store.showProductsAdmin() {

    i = 0
    products.forEach {
        i++
        stringNumber("$i & $enter")
        println("${it.name} sind noch ${it.quantity} Stück vorhanden")
    }
}
