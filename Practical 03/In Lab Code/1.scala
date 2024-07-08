def SumOfOdd(input : List[Int]) : Int = {
    input.filter( num => num %2 == 1).sum 
}

object MyApp extends App() {
    val MyList = List(2,3,5,7,8)
    println(s"Sum of odd numbers : ${SumOfOdd(MyList)}")
}