fun main(){
    //COVERTING TYPES
    var integer: Int = 100
    var decimal: Double = 12.5
    //integer = decimal // Type mistmach. Required: Int. Found: Double
    integer = decimal.toInt()
    println(integer)

    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
    val totalCost: Double = hourlyRate * hoursWorked
    println(totalCost)

    //TYPE INFERENCE
    val typeInferredInt = 42 /*Type = Int */
    val typeInferredDouble = 3.14159 /*Type = Double */

    val wantADouble = 3
    val actuallyDouble = 3.toDouble()
    //val actuallyDouble: Double = 3.0
    //val wantADouble = 3.0

    //CHARACTERS
    val characterA: kotlin.Char = 'a'
    val stringDog = "Dog"

    //STRING CONCATENATION
    var message = "Hello" + " my name is "
    val name = "Joe"
    message += name
    println(message)

    val exclamationMark: Char = '!'
    message += exclamationMark

    //STRING TEMPLATE
    message = "Hello my name is $name!" // "Hello my name is Joe"

    val oneThird = 1.0 / 3.0
    //val oneThirdLongString = "One third is $oneThird as a decimal."
    val oneThirdLongString = "One third is ${1.0 / 3.0} as a decimal."


    //LONG STRINGS
    val bigString ="""
          |You can have a string
          |that cointains multiple
          |lines
          |by
          |doing this.
    """.trimMargin()
    println(bigString)

    //TUPLES
    val coordinates: Pair<Int, Int> = Pair(2, 3)
    val coordinatesInferred = Pair(2, 3)
    val coordinatesMixed = Pair(2.3, 3)

    val x1 = coordinates.first
    val y1 = coordinates.second

    val (x, y) = coordinates

    val coordinates3D = Triple(2, 3, 1)
    val (x3, y3, z3) = coordinates3D
    //val x3 = coordinates3D.first
    //val y3 = coordinates3D.second
    //val z3 = coordinates3D.third 

    val (x4, y4, _) = coordinates3D
    println(x4)
    println(y4)

    //AS
    var string = "Hello there"
    val charSequence = string as CharSequence
    println(charSequence)

    //NUMBER TYPES
    val a: Short = 12
    val b: Byte = 120
    val c: Int = -100000

    val answer = a + b + c //Answe will be an Int
    println(answer)

    //ANY, UNIT, AND NOTHING TYPES
    val anyNumber: Any = 42
    val anyString: Any = "42"

    fun add(): Unit{
        val result = 2 + 2
        println(result)
    }

    fun doNothingForever(): Nothing{
        while(true){
            
        }
    }



}