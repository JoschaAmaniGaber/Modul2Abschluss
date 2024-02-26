/**
 * @param amaniDunia Gibt in der Konsole "AmaniDunia.Apps" aus
 */
fun amaniDunia() {
    println()
    println(" * > * > * AmaniDunia.Apps * < * < * ")
    println()
}

/**
 * @param load Druckt bitte warten mit verzögerung aus
 *
 * @param lateLoad ist unter Default ausgelagert
 */
// Wartezeit bei der load() Funktion
val lateLoad: Long = 333
fun load() {

    repeat((1..9).random()) {

        println(" . . . bitte warten . . . ")
        Thread.sleep(lateLoad)
        println()

    }

}
