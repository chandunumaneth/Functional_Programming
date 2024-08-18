import scala.io.StdIn
import scala.util.Try

object calculateInterest {

    val interest : Double => Double = (diposit : Double) => diposit match {

        case diposit if diposit <= 20000 => diposit * 0.02

        case diposit if diposit <= 200000 => diposit * 0.04

        case diposit if diposit <= 2000000 => diposit * 0.035

        case diposit if diposit > 2000000 => diposit * 0.065
    }

    @main def annualInterest : Unit = {
        
        println("Enter your diposit amount : ");
        val dipositAmount = Try(StdIn.readDouble().toDouble).toOption

        dipositAmount match {
            
            case (Some(number)) => println(s"Interest for your diposit amount $number is : ${interest(number)}") 

            case None => println("Please enter a valid diposit amount!")
        }
        }
}