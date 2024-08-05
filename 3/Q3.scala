// import scala.math.BigDecimal

def ArithmeticMean(num1 : Double, num2 : Double) : Double = {
    val mean = ((num1 + num2)/2.0)
    BigDecimal(mean).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
}

object Practical03 extends App() {
    val num1 = 15.75
    val num2 = 10.12
    println(s"Mean of the given two numbers : ${ArithmeticMean(num1,num2)}")
}
