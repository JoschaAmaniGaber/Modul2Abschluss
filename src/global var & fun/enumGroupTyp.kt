/**
 *
 */
enum class TypAndGroup(
    val typ: String,
    val group: String) {

    Trinken     ("Trinken",  ""),
    SoftDrink   ("Trinken",  "SoftDrink"),
    HotDrink    ("Trinken",  "HotDrink"),

    Essen       ("Essen",    ""),
    MainCourse  ("Essen",    "HauptGang"),
    Menu        ("Essen",    "Menü"),
}
