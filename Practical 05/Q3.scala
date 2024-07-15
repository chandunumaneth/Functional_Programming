def fibonacci(n : Int) : Int = n match {
    case x if x <= 1 => x

    case _ => fibonacci(n-1) + fibonacci(n-2)
}

def printFibonacci(n : Int) : Unit = {

    println(s"First $n fibonacci numbers : \n")
    for (i <- 0 until n)
    {
        val output = fibonacci(i)
        print(s"$output ")
    }
}

object MyApp extends App()
{
    printFibonacci(10)
}
