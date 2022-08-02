fun main() {
    val myFirstDice = Dice()
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")
}

//creating a class
class Dice {
    var sides = 6
    
    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }
}

/*Output
Your 6 sided dice rolled 3!
*/
