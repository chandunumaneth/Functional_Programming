import scala.math

def isPrime(num : Int) : Boolean = {
    if (num == 1) false
    else if (num == 2 ) true
    else !(2 to math.sqrt(num).toInt).exists(i => num % i == 0)
}

object primeFilter extends App()
{
    val numbers = List(1,2,3,4,5,6,7,8,9,10)

    println(s"Orignial List : ${numbers}")

    val primeNumbers : List[Int] = numbers.filter(x => isPrime(x))

    println(s"List containing prime numbers in the original list : ${primeNumbers}")
}