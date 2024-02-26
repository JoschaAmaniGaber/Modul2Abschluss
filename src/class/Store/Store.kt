/**
 *
 */
open class Store {

    // Account Default Variablen
    var userName: String = "Dies ist ein Default Namen zum diesem gibt es keinen Account"
    var age: Int = 0
    var currentUser: Account = Account(userName, age)
    var accountWithThisName: Boolean = false

    // Product Default Variablen
    var productName: String = "Xpreso"
    var price: Double = 2.0
    var product: Product = Product(productName, price, 0, "", "")

    // Store Default Variablen
    var productsStoreList: MutableList<Product> = mutableListOf()
    var cart: MutableMap<String,Int> = mutableMapOf()
    var i: Int = 0
    var end = false

    /**
     *
     */
    init {
        startshop()
    }

}