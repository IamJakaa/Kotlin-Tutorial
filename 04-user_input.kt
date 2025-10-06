fun main(){


    //Example 1: Reading a String input from the user
    print("Enter your name: ")
    val name = readLine() ?: "Guest" // Read user input, default to "Guest" if null
    println("Hello, $name!")


    //Example 2: Reading an Integer input from the user
    print("Enter your age: ")
    val age = readLine()?.toInt()  // Convert input to Int
    println("You are $age years old.")


    //Example 3: Reading a Double input from the user
    print("Enter price: ")
    val price = readLine()?.toFloatOrNull()
    println("Price entered: $price")
    

    //Example 4: Reading a Boolean input from the user
    print("Are you a student? (true/false): ")
    val isStudent = readLine()?.toBoolean()
    println("Are you a student? $isStudent")


    //Example 5: Multiple inputs 
     print("Enter first number: ")
    val num1 = readLine()!!.toInt()

    print("Enter second number: ")
    val num2 = readLine()!!.toInt()

    println("Sum = ${num1 + num2}")

}
