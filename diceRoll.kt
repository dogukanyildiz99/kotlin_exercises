fun main() {
	val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")
    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}

//creating a class
class Dice(val numSides: Int) {
    
    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
}

/*Output
Your 6 sided dice rolled 3!
Your 20 sided dice rolled 10!
*/
