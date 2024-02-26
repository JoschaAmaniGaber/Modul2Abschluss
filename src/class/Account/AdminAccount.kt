/**
 *
 */
class AdminAccount(

    name: String,
    passwort: String,
    age: Int,
    isAdmin: Boolean = true

): Account(name, passwort, age, isAdmin) {

    init {
        if (addToMapBool) {
            accountsMap[name] = this
            println("Für ${this.name} wurde ein Konto erstellt")
        }
    }
}