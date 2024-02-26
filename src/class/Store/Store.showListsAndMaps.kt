fun Store.showAccounts() {
    println("* * * Alle Accounts anzeigen * * *")
    var iD: Int = 1
    accountsMap.keys.forEach {
        println("$iD -> $it")
        iD ++
    }
}

fun Store.showProducts() {
    println("* * * Alle Produkte anzeigen * * *")
    i = 0
    productsStoreList.forEach {
        i ++
        if (it.quantity > 0) {
            println("$i -> $it")
        }
    }
}
