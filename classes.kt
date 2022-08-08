// Classes and inheritance in Kotlin
// To use pi for the round hut floor area
import kotlin.math.PI

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
	// You can use with for repeated use of an instance
    with (squareCabin) {
        println("\nSquare Cabin\n============")
	    println("Capacity: ${capacity}")
    	println("Material: ${buildingMaterial}")
    	println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }
    val roundHut = RoundHut(3, 10.0)
    with(roundHut) {
    	println("\nRound Hut\n=========")
    	println("Material: ${buildingMaterial}")
    	println("Capacity: ${capacity}")
    	println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
	}
    // A round tower with 3 floors
     val roundTower = RoundTower(4, 15.5, 3)
     with(roundTower) {
    	println("\nRound Tower\n==========")
    	println("Material: ${buildingMaterial}")
    	println("Capacity: ${capacity}")
    	println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
	}
}

// Creating an abstract class
abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
	abstract val capacity: Int
    
    fun hasRoom(): Boolean {
        return residents < capacity
    }
    
    abstract fun floorArea(): Double
}

// A subclass/child of an abstract class
class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
	// Use override to override the variables declared in the parent class
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea(): Double {
        return length * length
    }
}

// Use open to imply that this class can be inherited
open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    
    override fun floorArea(): Double {
        return PI * radius * radius
    }
}
// A subclass that inherits RoundHut
class RoundTower(residents: Int, radius: Double, val floors: Int = 2) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    
    override fun floorArea(): Double {
    	return super.floorArea() * floors
	}
}

/* Output
Square Cabin
============
Capacity: 6
Material: Wood
Has room? false
Floor area: 2500.0

Round Hut
=========
Material: Straw
Capacity: 4
Has room? true
Floor area: 314.1592653589793

Round Tower
==========
Material: Stone
Capacity: 12
Has room? true
Floor area: 2264.3029050748437
*/
