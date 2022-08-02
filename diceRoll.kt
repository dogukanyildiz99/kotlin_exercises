fun main() {
	val myFirstDice = Dice(6,"Red")
    	println("Your ${myFirstDice.numSides} sided ${myFirstDice.diceColour} coloured dice rolled ${myFirstDice.roll()}!")
    
    	val mySecondDice = Dice(20,"Blue")
    	println("Your ${mySecondDice.numSides} sided ${mySecondDice.diceColour} coloured dice rolled ${mySecondDice.roll()}!")
}

//creating a class
class Dice(val numSides: Int, val diceColour: String) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

/*Output
Your 6 sided dice rolled 3!
Your 20 sided dice rolled 10!
*/
