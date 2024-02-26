/**
 *
 */
class Account(
    var name: String,
    var passwort: String,
    var age: Int,
    var isAdmin: Boolean,
    var loggedIn: Boolean = false,
) {
    private var addToMapBool: Boolean = true

    /**
     * Sobald die class Account aufgerufen wird, wird geprüft, ob der Eingegebene Name schon vorhanden ist.
     * Ist dies nicht der Fall, wird der Name zur Liste hinzugefügt und der Boolean [addToMapBool] wird auf true gesetzt
     */
    init {

        if (!accountNames.contains(name)) {
            accountNames.add(name)
            addToMapBool = true
        } else if (accountNames.contains(name)) {
            println("Es gibt bereits einen Account mit dem Namen $name")
            addToMapBool = false
        } else println("Es gab einen anderen Fehler mit dem Namen $name")

    }
}