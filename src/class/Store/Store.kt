/**
 *
 */
open class Store {

    private var userName: String = "Dies ist ein Default Namen zum diesem gibt es keinen Account"
    private var age: Int = 0
    private var productName: String = "Xpreso"
    private var price: Double = 2.0
    private var accountWithThisName: Boolean = false
    private var end = false
    private var currentUser: Account = Account(userName, age)
    private var product: Product = Product(productName, price, 0, "", "")
}