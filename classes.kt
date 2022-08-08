// Classes and inheritance in Kotlin
fun main() {
    val squareCabin = SquareCabin(6)
	// You can use with for repeated use of an instance
    with (squareCabin) {
        println("\nSquare Cabin\n============")
	    println("Capacity: ${capacity}")
    	println("Material: ${buildingMaterial}")
    	println("Has room? ${hasRoom()}")
    }
    val roundHut = RoundHut(3)
    with(roundHut) {
    	println("\nRound Hut\n=========")
    	println("Material: ${buildingMaterial}")
    	println("Capacity: ${capacity}")
    	println("Has room? ${hasRoom()}")
	}
    // A round tower with 3 floors
     val roundTower = RoundTower(4,3)
     with(roundTower) {
    	println("\nRound Tower\n==========")
    	println("Material: ${buildingMaterial}")
    	println("Capacity: ${capacity}")
    	println("Has room? ${hasRoom()}")
	}
}

// Creating an abstract class
abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
	abstract val capacity: Int
    
    fun hasRoom(): Boolean {
        return residents < capacity
    }
}

// A subclass/child of an abstract class
class SquareCabin(residents: Int) : Dwelling(residents) {
	// Use override to override the variables declared in the parent class
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

// Use open to imply that this class can be inherited
open class RoundHut(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
}
// A subclass that inherits RoundHut
class RoundTower(residents: Int, val floors: Int = 2) : RoundHut(residents) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
}

/* Output
Square Cabin
============
Capacity: 6
Material: Wood
Has room? false

Round Hut
=========
Material: Straw
Capacity: 4
Has room? true

Round Tower
==========
Material: Stone
Capacity: 12
Has room? true
*/
