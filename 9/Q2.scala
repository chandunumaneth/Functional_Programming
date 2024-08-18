import scala.util.Try

object patternMatching {

    @main def classifyNumbers(arg : String*) : Unit = {
        
        if (arg.length < 1) {
            println("Please provide an argument!")
            return
        }
        else if (arg.length != 1) {
            println("Please provide exactly one argument!")
            return
        }

        val input =  Try(arg(0).toInt).toOption

        val classify : Int => String = num => num match {
            case num if num <= 0 => "Negative/Zero"

            case num if num % 2 == 0 => "Even Number is given"

            case num if num % 2 == 1 => "Odd number is given"
        }

        input match {
            case Some(number) => println(classify(number))

            case None => println("Please enter a valid integer!")
        }
    }
}