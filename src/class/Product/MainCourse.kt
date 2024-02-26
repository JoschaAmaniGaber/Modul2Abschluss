/**
 * @property name String
 * @property price Double
 * @property rating Double
 * @property typ String = "Food"
 * @property group String = "MainCourse"
 * @see Product
 * @see Food
 */
class MainCourse(
    name: String,
    price: Double,
    quantity: Int,
    var beilage: String,
    typ: String = TypAndGroup.MainCourse.typ,
    group: String = TypAndGroup.MainCourse.group
): Food(name, price, quantity, typ, group) {


    init {
        if (addToListBool) {
            products.add(this)
            addTypAndGroup(typ, group)
            println("Das Produkt $name mit der Beilage $beilage vom Typ: $typ aus Gruppe: $group wurde zur Liste hinzugefügt")
        }
    }
}