/**
 * @property name String
 * @property price Double
 * @property rating Double
 * @property typ String = "Food"
 * @property group String
 * @see Product
 * @see MainCourse
 * @see Menu
 */
open class Food(
    name: String,
    price: Double,
    quantity: Int,
    typ: String = TypAndGroup.Essen.typ,
    group: String
):Product(name, price, quantity, typ, group) {


}