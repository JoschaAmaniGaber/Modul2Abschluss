fun Store.sort() {
    if (currentUser.loggedIn && !currentUser.isAdmin) {
        listSortBy(products)
    }
    else println("Du bist noch nicht eingeloggt oder du bist ein Admin")
}

fun Store.filter() {
    if (currentUser.loggedIn && !currentUser.isAdmin) {
        listFilter(products)
    } else println("Du bist noch nicht eingeloggt oder du bist ein Admin")
}

fun Store.whichSort() {
    println("Nach was möchtest du sortieren?")
    stringNumber("1 & $enter")
    println("Name")
    stringNumber("2 & $enter")
    println("Preis")
    stringNumber("3 & $enter")
    println("Verfügbarkeit")
}

fun Store.whichFilter() {
    println("Wonach möchtest du Filtern?")
    stringNumber("1 & $enter")
    println("Typ")
    stringNumber("2 & $enter")
    println("Kategorie")
}

fun Store.listSortBy(list: MutableList<Product>) {

    whichSort()
    when (readln()) {
        "1" -> {
            println("Nach Namen sortiert")
            list.sortBy { it.name }
            println(list)
        }

        "2" -> {
            println("Nach Preis sortiert")
            list.sortBy { it.price }
            println(list)
        }

        "3" -> {
            println("Nach Verfügbarkeit sortiert")
            products.sortBy { it.quantity }
            println(list)
        }

        else -> {
            wrongAnswer()
            listSortBy(list)
        }
    }
}

fun Store.listFilter(list: MutableList<Product>) {
    whichFilter()

    when (readln()) {

        "1" -> whichTyp(list)

        "2" -> whichGroup(list)

        else -> {
            wrongAnswer()
            listFilter(list)
        }
    }
}

fun Store.whichGroup(list: MutableList<Product>) {
    i = 0
    println("Nach welcher Gruppe möchtest du filtern?")

    listForEach(productGroup)

    when (readln()) {
        "1" -> {
            println("Alle Produkte vom Typ ${productGroup.elementAt(0)}")
            println(list.filter { it.group == productGroup.elementAt(0) })
        }

        "2" -> {
            println("Alle Produkte vom Typ ${productGroup.elementAt(1)}")
            println(list.filter { it.group == productGroup.elementAt(1) })
        }

        "3" -> {
            println("Alle Produkte vom Typ ${productGroup.elementAt(2)}")
            println(list.filter { it.group == productGroup.elementAt(2) })
        }

        "4" -> {
            println("Alle Produkte vom Typ ${productGroup.elementAt(3)}")
            println(list.filter { it.group == productGroup.elementAt(3) })
        }

        else -> {
            wrongAnswer()
            whichGroup(list)
        }
    }
}

fun Store.listForEach(list: MutableSet<String>) {
    list.forEach {
        i++
        stringNumber("$i & $enter")
        println(it)
    }
}

fun Store.whichTyp(list: MutableList<Product>) {
    i = 0
    println("Nach welchem Typ möchtest du filtern?")

    listForEach(productTyp)

    when (readln()) {
        "1" -> {
            println("Alle Produkte vom Typ ${productTyp.elementAt(0)}")
            println( list.filter { it.typ == productTyp.elementAt(0) })
        }

        "2" -> {
            println("Alle Produkte vom Typ ${productTyp.elementAt(1)}")
            println(list.filter { it.typ == productTyp.elementAt(1) })
        }

        else -> {
            wrongAnswer()
            whichTyp(list)
        }
    }
}
