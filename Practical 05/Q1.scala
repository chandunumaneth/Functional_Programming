import scala.io.StdIn

def getProductList () : List[String] = {

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

    inventory
}

//printing using recursive approach

def printProductList (inventory : List[String]) : Any = {

    println("\nProduct List Using Recursive Approach : \n")

    def helperFunc (inventory : List[String] , index : Int) : Any = inventory match {
        case Nil => // Do Nothing
        case head :: tail => println(s"${index+1}. ${inventory.head}")
                             helperFunc(inventory.tail,index+1)
    }

    helperFunc(inventory,0)
}

//printing using zipWithIndex

def printProductList2 (inventory : List[String]) : Any = {

    println("\nProduct List Using zipWithIndex : \n")

    inventory.zipWithIndex.foreach {
        case (product,index) =>
            println(s"${index+1}. $product")
    }
}

def getTotalProducts (inventory : List[String]) : Unit = {
    println(s"\nTotal number of products : ${inventory.size}")
}

@main def Inventory () : Any = {

    val ProductList = getProductList()

    printProductList(ProductList)

    printProductList2(ProductList)

    getTotalProducts(ProductList)

}