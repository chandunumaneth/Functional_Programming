def SumOfEven(input : List[Int]) : Int = {
    input.filter(_%2 ==0).sum
}

object Practical04 extends App() {
    val MyList = List(2,3,5,6,8,10,11)
    println(s"Sum of all even numbers in the list : ${SumOfEven(MyList)}")
}