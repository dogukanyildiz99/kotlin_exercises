fun main() {
	val myFirstDice = Dice(6)
    	println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
    
    	val mySecondDice = Dice(20)
    	println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}

//creating a class
class Dice(val numSides: Int) {
    
    fun roll(): Int {
        return (1..numSides).random()
    }
}

/*Output
Your 6 sided dice rolled 3!
Your 20 sided dice rolled 10!
*/
