/**
 * @property name String
 * @property price Double
 * @property rating Double
 * @property inhalt Double
 * @property typ String = "Drink"
 * @property group String = "SoftDrink"
 * @see Produkt
 * @see Drink
 */
class SoftDrink(
    name: String,
    price: Double,
    private var inhalt: Double,
    quantity: Int,
    typ: String = TypAndGroup.SoftDrink.typ,
    group: String = TypAndGroup.SoftDrink.group,

): Drink(name, price,quantity, typ, group) {


    init {
        if (addToListBool) {
            products.add(this)
            addTypAndGroup(typ, group)
            println("Das Produkt $name in der größe $inhalt Liter vom Typ: $typ aus Gruppe: $group wurde zur Liste hinzugefügt")
        }
    }

}