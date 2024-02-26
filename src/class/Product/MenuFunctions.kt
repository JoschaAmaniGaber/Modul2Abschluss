/**
 * Auswahl zwischen mit Suppe, mit Salat oder ohne Vorspeise. Teil der Methode [Menu.withStarter].
 * @see Menu
 */
fun Menu.showStarterSelectionMenuClass() {

    println("Möchtest du als deine Vorspeise eine Suppe dazu dann drücke -> 1 & >>> ENTER <<<")
    println("Möchtest du als deine Vorspeise einen Salat dazu dann drücke -> 2 & >>> ENTER <<<")
    println("Möchtest du KEINE Vorspeise dazu dann drücke -> 0 & >>> ENTER <<<")

}

/**
 *
 */
fun Menu.withStarter() {

    showStarterSelectionMenuClass()

    when (readln()) {

        "1" -> {
            println("Du möchtest eine Suppe als Vorspeise")
            withStarter = true
        }

        "2" -> {
            println("Du möchtest einen Salat als Vorspeise")
            withStarter = false
        }

        "3" -> {
            println("Du möchtest KEINE Vorspeise")
            withStarter = null
        }

        else -> {
            println(" ! ! ! Falsche Eingabe ! ! ! ")
            println("Versuchs gleich noch einmal")
            load()
            withStarter()
        }

    }
    // --- when
}
// --- withStarter()

//