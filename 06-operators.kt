import kotlin.math.*

fun main(){

    //Arithmetic
    println(2 + 6)
    println(10 - 2)
    println(2 * 4)
    println(24 / 3)
    println(22.0 / 7.0)
    println("%.0f".format(28.0 % 10.0))
    //println(1.sh1(3))
    println(32 shr 2)
    println(((8000 / (5 * 10))-32) shr (29 % 5))
    println(350 / 5 + 2)
    println(350 / (5 + 2))

    //MATH FUNCTION
    println(sin(45 * PI)/180)
    println(cos(135 * PI)/180)
    sqrt(2.0)
    max(5, 10)
    max(-5, -10)
    max(sqrt(2.0), PI/2)

    
    //VARIABLES & CONSTANTS
    val number: Int = 10
    //number = 0 /*Val cannot be reassigned */

    val pi: Double = 3.14159 // val pi: Double = 3.14159

    var variableNumber: Int = 42
    variableNumber = 0
    variableNumber = 1_000_000

    //ARITHMETIC WITH VARIABLES
    var counter: Int = 0
    counter += 1
    counter -= 1
    println(counter)

    counter += 1
    counter *= 3
    counter /= 2
    println(counter)

}