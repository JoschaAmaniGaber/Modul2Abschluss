/**
 * @param name String
 * @param price Double
 * @param typ String
 * @param group String
 * @see Drink
 * @see SoftDrink
 * @see HotDrink
 */
open class Drink(
    name: String,
    price: Double,
    quantity: Int,
    typ: String = TypAndGroup.Trinken.typ,
    group: String
):Product(name, price, quantity, typ, group)
