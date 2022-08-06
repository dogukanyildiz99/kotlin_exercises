fun main() {
    var age = 24
    var layers = 5
    
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeCandles(age: Int) {
    //flames
    print(" ")
    repeat(age){
        print(",")
    }
    println()
    //candles
    print(" ")
    repeat(age){
    	print("|")
   	}
    println()
}

fun printCakeTop(age: Int) {
    repeat(age+2){
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers){
        repeat(age+2){
            print("@")
    	}
    	println()
    }
}

/* Output
 ,,,,,,,,,,,,,,,,,,,,,,,,
 ||||||||||||||||||||||||
==========================
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
*/
