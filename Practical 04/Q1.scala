val bookNames = Array("Harry Potter","Peaky Blinders","Sherlock Holmes","Adventures of Tin Tin")
val bookQuantity = Array(1,23,10,7)

def displayInventory (array1 : Array[String],array2 : Array[Int]) : Any = {
   
    println()
    if(array1.nonEmpty && array2.nonEmpty)
    {
        println(s"${array1.head} -> ${array2.head}")
        displayInventory(array1.tail,array2.tail)
    }
    else
    {
        println("Above listed are the available inventory!")
    }
}

def addA(x : Array[Int]) : Int = if (x.isEmpty) 0 else x.head + addA(x.tail)

def restockItem(bookName : String, newCount : Int) : Unit = {
    if(bookName.isEmpty() || newCount <= 0)
        println("Invalid Restock Attempt!")
    
    val restockID = bookNames.indexOf(bookName)

    if (restockID != -1)
    {
        bookQuantity(restockID) += newCount
        println("\nNew Quantity updated!")
        println()
        println("Updated Book Inventory : ")
        displayInventory(bookNames,bookQuantity)
    }
    else
        println("\nNo book was found with this name! Restock record unsuccessful!")
}

def sellItem(bookName : String, sellCount : Int) : Unit = {
    if(bookName.isEmpty() || sellCount <=0)
        println("Invalid Selling Attempt!")

    val saleID = bookNames.indexOf(bookName)

    if(saleID != -1)
    {
        bookQuantity(saleID) -= sellCount

        if(bookQuantity(saleID) < 0)
        {
            println("Remaining stock exceeded! Sale cannot be placed!")
        }
        else
        {
            println("\nSale Updated!")
            println()
            println("Updated Book Inventory : ")
            displayInventory(bookNames,bookQuantity)
        }
    }
    else
        println("\nNo book was found with this name! Sale record unsuccessful!")
}

object BookShop extends App()
{
    println("Available books and available book count ;");
    displayInventory(bookNames,bookQuantity)

    restockItem("Harry Potter",5)
    sellItem("Peaky Blinders",30)
}

