/**
 * @property products
 */
fun Store.emptyCartInit() {
    cart.clear()
    products.forEach {
        cart[it.name] = 0
    }
}

/**
 * @property products
 */
fun Store.storeProducts() {
    productsStoreList.clear()
    products.forEach {
        productsStoreList.add(it)
    }
}

/**
 * @property AdminAccount
 * @property UserAccount
 * @property SoftDrink
 * @property HotDrink
 * @property MainCourse
 * @property Menu
 */
fun Store.initDefaultData() {

    AdminAccount("Admin1", "Admin1", 33)
    AdminAccount("Admin2", "Admin2", 44)

    UserAccount("guest1", "guest1", 33, 444.4)
    UserAccount("guest2", "guest2", 44, 311.1)
    UserAccount("guest3", "guest3", 33, 111.1)
    UserAccount("guest4", "guest4", 44, 211.1)

    SoftDrink("Wasser kl", 2.0, 0.33, 21)
    SoftDrink("Wasser gr", 4.5, 0.75, 21)
    SoftDrink("Kola Mit",  2.5, 0.33, 21)
    SoftDrink("Kola Ohne", 2.5, 0.33, 21)

    HotDrink("Xprso",  2.0, 13)
    HotDrink("Kaffee", 4.5, 13)
    HotDrink("Cappu",  3.8, 13)
    HotDrink("Latte",  4.5, 13)

    MainCourse("Schnitzel",      12.99, 8, "Pommes")
    MainCourse("Steak",          15.99, 8, "Kartoffeln")
    MainCourse("Veg. Schnitzel", 10.99, 8, "Püree")
    MainCourse("Quiche",         8.99,  8, "Salat")

    Menu("Menü 1", 8.99, 11)
    Menu("Menü 2", 8.99, 11)
    Menu("Menü 3", 9.99, 11)
    Menu("Menü 4", 9.99, 11)

    println()
    println("Alle Default Werte wurden initiiert.")

}

