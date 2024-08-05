def evenNumbers(numbers : List[Int]) : List[Int] = {
    numbers.filter(x => x % 2 == 0)
}

object MyApp extends App()
{
    val numbers = List(1,2,3,4,5,6,7,8,9,10)

    println(s"Original Number List : ${numbers}")
    
    println(s"List containing even numbers in the original list : ${evenNumbers(numbers)}")
}
