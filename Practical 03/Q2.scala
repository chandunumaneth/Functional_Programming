def filterStrings(input : List[String]) : List[String] = {
    input.filter(_.length > 5)
}

object Practical02 extends App() {
    val MyList = List("Audi","Mercedes","Bently","Rolls Royce","Toyota","BMW","Range Rover")
    println(s"Filtered List : ${filterStrings(MyList)}")
}