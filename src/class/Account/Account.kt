/**
 *
 */
open class Account(
    var name: String,
    var passwort: String,
    var age: Int,
    var isAdmin: Boolean,
    var loggedIn: Boolean = false,
) {
    var addToMapBool: Boolean = true

    constructor(name: String, age: Int): this(name, "", age, false)

    /**
     * Sobald die class Account aufgerufen wird, wird geprüft, ob der eingegebene Name schon vorhanden ist.
     * Ist dies nicht der Fall, wird der Name zur Liste hinzugefügt und der Boolean wird auf true gesetzt
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

    override fun toString(): String {

        return """
            
            * * *
            name: $name
            passwort: $passwort
            age: $age
            admin: $isAdmin
        
            * * *
            
        """.trimIndent()
    }
}