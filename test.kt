//Basic testing of dice roller app
package com.example.diceroller
//imports of test annotation and assert method
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    // annotation of test
    @Test
    fun generates_number() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        // testing the rollResult first parameter represent the fail message the second one is the condition
        assertTrue("value of rollResult was not between 1 and 6", rollResult in 1..6)
    }
}
