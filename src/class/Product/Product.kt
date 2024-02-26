/**
 *
 */
open class Product(
    var name: String,
    var price: Double,
    var quantity: Int = 8,
    var typ: String,
    var group: String,
    var rating: MutableList<Int> = generateRatings()
) {
    var addToListBool: Boolean = true

    /**
     * Prüft, ob die Liste der Name eingegebene Name schon in dem Set von Namen an Produkten vorhanden ist,
     * sollte dies NICHT der Fall sein speichert sie den Produkt-Namen, im Set und setzt den Bool auf true.
     * Ansonsten gibt er eine Fehlermeldung aus und setzt den Wert auf false
     */
    init {
        if (!productsName.contains(name)) {
            productsName.add(name)
            addToListBool = true
        } else {
            println("ACHTUNG DiESES $name PRODUKT IST SCHON VORHANDEN!")
            println("---")
            addToListBool = false
        }
    }

    /**
     * Gibt die Werte der Klasse [Product] auf die folgende Weise aus
     * @return """
     *             * * *
     *             name: $name
     *             price: $price
     *             rating: ${rating.sum()/rating.size}
     *             noch Vorhanden: $quantity
     *             * * *
     *         """.trimIndent()
     */
    override fun toString(): String {
        return """
            * * *
            name: $name
            price: $price 
            rating: ${rating.average()}
            noch Vorhanden: $quantity
            * * *
        """.trimIndent()
    }
}