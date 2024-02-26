/**
 * @property name String
 * @property price Double
 * @property rating Double
 * @property withStarter
 * @property typ String = "Food"
 * @property group String = "Menü"
 * @see Product
 * @see Food
 */
class Menu(
    name: String,
    price: Double,
    quantity: Int,
    var withStarter: Boolean? = true,
    typ: String = TypAndGroup.Menu.typ,
    group: String = TypAndGroup.Menu.group,
): Food(name, price, quantity, typ, group) {

    init {
        if (addToListBool) {
            products.add(this)
            addTypAndGroup(typ, group)
            println("Das Produkt ${this.name} vom Typ: $typ aus Gruppe: $group wurde zur Liste hinzugefügt")
        }
    }

}
// --- Menu