/**
 * @property name String
 * @property price Double
 * @property rating Double
 * @property mitHafer Boolean
 * @property typ String = "Drink"
 * @property group String = "HotDrink"
 * @see Product
 * @see Drink
 */
class HotDrink(
    name: String,
    price: Double,
    quantity: Int,
    private var mitHafer: Boolean = false,
    typ: String = TypAndGroup.HotDrink.typ,
    group: String = TypAndGroup.HotDrink.group,
): Drink(name, price, quantity, typ, group) {

    init {
        if (addToListBool) {
            products.add(this)
            addTypAndGroup(typ, group)
            println("Das Produkt ${this.name} vom Typ: $typ aus Gruppe: $group wurde zur Liste hinzugefügt")
        }
    }

    fun haferErsatz() {

        mitHafer = true
        price += 0.5
        println("Der Preis wurde um 50 Cent erhöht, da du Hafermilch möchtest")

    }
}