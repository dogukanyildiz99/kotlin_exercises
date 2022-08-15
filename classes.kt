// Classes and inheritance in Kotlin
// To use pi for the round hut floor area
import kotlin.math.PI
// To use square root function for carpet length
import kotlin.math.sqrt

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
        println("Carpet Length: ${calculateMaxCarpetLength()}")
	}
    // A round tower with 3 floors
     val roundTower = RoundTower(7, 15.5)
     with(roundTower) {
    	println("\nRound Tower\n==========")
    	println("Material: ${buildingMaterial}")
    	println("Capacity: ${capacity}")
    	println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
        println("Has room? ${hasRoom()}")
		getRoom()
		println("Has room? ${hasRoom()}")
		getRoom()
        println("Carpet Length: ${calculateMaxCarpetLength()}")
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
    // if avalaible gives room to the resident
    fun getRoom() {
        if (capacity > residents) {
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }
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
    
    fun calculateMaxCarpetLength(): Double {
        // lenght of a square carpet that can be fit in a circle
    	return sqrt(2.0) * radius
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
Carpet Length: 14.142135623730951

Round Tower
==========
Material: Stone
Capacity: 8
Has room? true
Floor area: 1509.5352700498956
Has room? true
You got a room!
Has room? false
Sorry, at capacity and no rooms left.
Carpet Length: 21.920310216782976
*/
