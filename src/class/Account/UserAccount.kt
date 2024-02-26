/**
 * Kind class von [Account] beinhaltet die folgenden Parameter:
 * @property name String
 * @property passwort String
 * @property age Int
 * @property isAdmin String
 * @property cash Double Neues Parameter, speichert Guthaben
 * @property cart MutableList<String>. Hier drin wird der Warenkorb des Users gespeichert
 * @see Account
 */
class UserAccount(
    name: String,
    passwort: String,
    age: Int,
    private var cash: Double,
    private var cart: MutableMap<String, Int> = mutableMapOf(),
    isAdmin: Boolean = false
): Account(name, passwort, age, isAdmin) {

    init {
        if (addToMapBool) {
            accountsMap[name] = this
            println("Für ${this.name} wurde ein Konto erstellt. $name ist $age Jahre alt und auf seinem Konto stehen $cash € zur Verfügung")
        }
    }

    override fun toString(): String {
        return """
            
            * * *
            name: $name
            passwort: $passwort
            age: $age
            admin: $isAdmin
            cash: $cash
            cart: $cart
            * * *
            
        """.trimIndent()
    }

}