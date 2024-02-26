/**
 * Hier werden alle Accounts in einem Set gespeichert.
 * Dies soll sicherstellen, das es keine doppelten Account-Namen gibt. [Account.name]
 */
val accountNames: MutableSet<String> = mutableSetOf()

/**
 * Dies ist eine MutableMap, da auf diese Weise, auf jedes Konto über einen String als Key zugegriffen werden kann.
 */
val accountsMap: MutableMap<String,Account> = mutableMapOf()

/**
 * Eine Liste von Produkten
 */
var products: MutableList<Product> = mutableListOf()

/**
 * Mit dieser Liste möchte ich die angelegten Accounts und Produkte schon vorhanden sind. Damit sie nicht doppelt gespeichert werden können. [Product.name]
 */
var productsName: MutableSet<String> = mutableSetOf()

/**
 * Ein Set der verschiedenen Product-Typen
 */
var productTyp: MutableSet<String> = mutableSetOf()

/**
 * Ein Set der verschiedenen Product-Gruppen
 */
var productGroup: MutableSet<String> = mutableSetOf()

/**
 * Funktion um [productTyp] & [productGroup] zu ihren jeweiligen Sets hinzuzufügen
 */
fun addTypAndGroup(typ: String, group: String) {
    productTyp.add(typ)
    productGroup.add(group)
}

/**
 * Gibt " >ENTER< " wieder
 */
const val enter: String = " >ENTER< "

/**
 * Gibt den übergebenen String mit in der Form "Drücke [string] & [enter] -> "
 * @param string ist ein String, der der Funktion übergeben wird meist ist dies eine Zahl, die der User dann Eingeben kann, um zum folgenden zu gelangen
 */
fun stringNumber(string: String) {
    print("Drücke [$string] & $enter -> ")
}

var average = 0.0

/**
 * Diese Funktion erstellt eine zufällige Bewertung
  */
fun randomRating(): Int {
    return (1..5).random()
}

/**
 * Diese Funktion erstellt eine zufällige Anzahl (1-10) an Bewertungen
 */
fun generateRatings(): Double {
    val ratings: MutableList<Int> = mutableListOf<Int>()
    repeat((1..10).random()) {
        ratings.add(randomRating())
    }

    // Aufgabe 3c
    average = ratings.average()

    return average
}