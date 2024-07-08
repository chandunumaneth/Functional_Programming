@main def PatternMatching (input : String) : Unit = {
    val parsedInput = try {
        input.toInt
    } catch {
        case _: NumberFormatException =>
            println("Please enter a valid integer!")
            return
    }

    val result = parsedInput match {
        case n if n <=0 => "Negative / Zero is given"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
    }

    println(result)
}