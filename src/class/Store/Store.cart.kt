/**
 *
 */
fun Store.showCartAndPay() {
    if (currentUser.loggedIn && !currentUser.isAdmin) {

        showCart()
        println("Möchtest du Bezahlen? Dann Drücke pay & $enter")
        if (readln() == "pay") {
            pay()
        }

    } else println("Du bist noch nicht eingeloggt")
}

fun Store.pay() {
    var priceProduct: Double = 0.0
    var productPriceTotal: Double = 0.0
    var totalCost: Double = 0.0
    var anzahlProduct: Int = 0
    cart.forEach { itCart ->
        anzahlProduct = itCart.value
        if (anzahlProduct > 0) {
            var checkProductNameToPrice: String = itCart.key
            productsStoreList.forEach {
                if (it.name == checkProductNameToPrice) {
                    priceProduct = it.price
                }
            }
            productPriceTotal = priceProduct * anzahlProduct
            println("Der Gesamt Preis für ${itCart.value} Stück von ${itCart.key} liegt bei $productPriceTotal")
            totalCost += productPriceTotal
            println("Die gesamt Kosten OverAll betragen $totalCost")
            println("Möchtest du bezahlen? >check out< & $enter")
            if (readln() == "check out") {
                emptyCartInit()
                println("Deine Artikel wurden bezahlt und dein Warenkorb ist wieder leer")
            }

        }
    }
}


/**
 *
 */
fun Store.addToCart() {
    if (currentUser.loggedIn && !currentUser.isAdmin) {
        println("* * * SHOP * * *")
        showProducts()
        println("Wähle eine der vorangegangenen Zahlen & $enter")
        var nr: Int = -1
        while ((nr !in 0..productsStoreList.size)) {
            try {
                nr = readln().toInt()
            } catch (e: NumberFormatException) {
                println("Fehler: $e")
                println("Eingabe ist keine Zahl")
            }
            if (nr !in 0..productsStoreList.size) println("Bitte gib nächstes mal eine ganze Zahl zwischen 1 und ${productsStoreList.size} ein")
        }
        product = productsStoreList[nr - 1]
        productName = product.name

        println("Du hast $productName gewählt. Es gibt noch ${product.quantity} Stück in unserem Shop.")
        if (product.quantity == 0) {
            println("Nicht genug Produkte vorhanden")
            wrongAnswer()
            addToCart()
        }
        println("Wie viele $productName möchtest du in deinen Einkaufswagen tun?")
        var quantityInCart: Int? = cart[productName]
        var anzahl: Int = 0
        try {
            anzahl = readln().toInt()
            if (anzahl in 0..product.quantity) {
                product.quantity -= anzahl
                if (quantityInCart != null) {
                    cart[productName] = quantityInCart + anzahl
                }
            } else {
                println("Nicht genug Produkte vorhanden")
                wrongAnswer()
                addToCart()
            }

        } catch (e: Exception) {
            wrongAnswer()
            addToCart()
        }

        showCart()

        println("Wenn du ein weiteres Produkt zu deinem Warenkorb hinzufügen möchtest, $enter")
        if (readln() == "") {
            addToCart()
        }
    } else println("Du bist noch nicht eingeloggt oder du bist ein Admin")
}

fun Store.showCart() {
    print("Warenkorb:")
    cart.forEach {
        if (it.value > 0) println(it)
    }
}