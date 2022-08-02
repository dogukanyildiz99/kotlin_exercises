fun main() {
  	//to specify the range we're working on
	val diceRange = 1..6
	//val diceRange: IntRange = 1..6 is another way of specifying it
    val randomNumber = diceRange.random()
    //(1..6).random() is also another way of randomly generating a number between given range
    println("Random number: ${randomNumber}")
    /*Output
    Random number: 5
    Random number: 2
    Random number: 4
    ...
    */
}
