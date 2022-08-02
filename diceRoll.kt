fun main() {
	val myFirstDice = Dice()
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")
    myFirstDice.sides = 20
    println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}!")
}

//creating a class
class Dice {
    var sides = 6
    
    fun roll(): Int {
        val randomNumber = (1..sides).random()
        return randomNumber
    }
}

/*Output
Your 6 sided dice rolled 3!
Your 20 sided dice rolled 10!
*/
