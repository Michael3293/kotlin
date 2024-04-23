fun main() {
   
    print("Enter a positive nonzero integer: ")
    var userInput = readLine()!!.toInt()

    
    while (userInput <= 0) {
        println("Please enter a positive nonzero integer.")
        print("Enter a positive nonzero integer: ")
        userInput = readLine()!!.toInt()
    }

    
    var sumOfIntegers = 0
    for (i in 1..userInput) {
        sumOfIntegers += i
    }

    
    println("The sum of integers from 1 to $userInput is: $sumOfIntegers")
}