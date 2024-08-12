import scala.util.Try

@main def classifyInput(args : String*) : Unit = {

    if (args.length < 1) {
        println("Please Provide an Argument after function name!")
        return
    }
    else if (args.length != 1) {
        println("Please Provide exactly one Argument!")
        return
    }

    val validInput = Try(args(0).toInt).toOption

    val classification : Int => String = num => num match {
        case _ if num % 3 == 0 && num % 5 == 0 => "Multiple of Both Three and Five"
        case _ if num % 3 == 0 => "Multiple of Three"
        case _ if num % 5 == 0 => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
    }

    validInput match {
        case Some(number) => println(classification(number))

        case None => println("Please Provide a Valid Integer Argument!")
    }
}