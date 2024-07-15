error id: file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2005/Q1.scala:[755..755) in Input.VirtualFile("file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2005/Q1.scala", "import scala.io.StdIn

def getProductList () : Unit = {

    println("Welcome!")

    var product : String = ""
    var inventory : List[String] = List()

    println("Enter Product Name ('done' to exit) : ")
    product = StdIn.readLine().trim()

    while (product!="done")
    {
        inventory = inventory :+ product
        println("Enter Product Name ('done' to exit) : ")
        product = StdIn.readLine().trim()
    }
}

def printProductList (inventory : List[String]) : Any = {

    var i = 1

    println("Product List : \n")

    
    if (inventory.nonEmpty)
    {
        println(inventory.head);printProductList(inventory.tail)
    }
    
    println("Product List successfully displayed!")
}

@main def ")
file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2005/Q1.scala
file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2005/Q1.scala:36: error: expected identifier; obtained eof
@main def 
          ^
#### Short summary: 

expected identifier; obtained eof