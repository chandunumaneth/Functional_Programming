def reverseString(word : String) : String = {
    if (word.isEmpty()) " "
    else reverseString(word.tail) + word.head
}

object Practical01 extends App() {
    var MyWord = "HelloWorld"
    println (s"Reversed Word : ${reverseString(MyWord)}")
}