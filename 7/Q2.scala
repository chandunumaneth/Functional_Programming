def squareNumbers(numbers : List[Int]) : List[Int] = {
    numbers.map(x => x*x)
}

object square extends App()
{
    val numbers = List(1,2,3,4,5)

    println(s"Original List : ${numbers}")

    println(s"List containing square of original list elements : ${squareNumbers(numbers)}")
    
}