file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2005/Q2.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition Library is defined in
  D:/UCSC/Year 02/Y2S1/Functional Programming/Practicals/Practical 05/Q2.scala
and also in
  D:/UCSC/Year 02/Y2S1/Functional Programming/Practicals/Practical 05/Q2.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 2987
uri: file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2005/Q2.scala
text:
```scala
object LibraryManagementSystem {
    case class Book (title : String, author : String, isbn : String)

    val book1 = Book("Peaky Blinders", "Steven Knight" , "00-01")
    val book2 = Book("Harry Potter", "J. K. Rowling", "00-02")
    val book3 = Book("Intestellar", "Christopher Nolan", "00-03")

    var bookCollection : Set[Book] = Set(book1,book2,book3)

    def addBook(newBook : Book) : Any = {
        bookCollection += newBook
        println(s"New Book with title ${newBook.title} added!\n")
    }

    def removeBook(ISBN : String) : Unit = {
        val bookRemoval = bookCollection.find(_.isbn == ISBN)

        bookRemoval match {
            case Some(book) => bookCollection -= book
                               println(s"\nBook with ISBN ${ISBN} is removed!\n")

            case None => println("\nNo books were found with this ISBN!\n")
        }

    }

    def findBook(ISBN : String) : Unit = {
        val findBook = bookCollection.find(_.isbn == ISBN)

        findBook match {
            case Some(book) => println(s"\nBook with ISBN $ISBN is found!\n")

            case None => println(s"\nNo matches were found with ISBN $ISBN!\n")
        }
    }

    def displayCollection(matchCollection : Set[Book]) : Unit = {
        
        println("\nBook Collection : \n")

        matchCollection.zipWithIndex.foreach {
            case (book,index) => println(s"Book Number : ${index+1}\nBook Name : ${book.title}\nBook Author : ${book.author}\nsBook ISBN : ${book.isbn}\n")
        }
    }

    def findByTitle(bookTitle : String) : Unit = {

        val bookOption = bookCollection.filter(_.title == bookTitle)

        if(bookOption.nonEmpty)
        {
            println(s"Book / Books with title $bookTitle is found!\n")
            displayCollection(bookOption)
        }
        else
        {
            println(s"Book with title $bookTitle was not found!")             
        }
    }

    def booksByAuthor(Author : String) : Unit = {

        val authorCollection : Set[Book] = bookCollection.filter(_.author == Author)

        if (authorCollection.nonEmpty)
        {
            println("Books with mentioned author : \n")
            displayCollection(authorCollection)
        }
        else
        {
            println("No books were found with mentioned author!\n")
        }
    }


//Initial Book Collection 

@main def Library () : Unit = {
    

    println("Existing Book Collection : \n");

    displayCollection(bookCollection)

    val book4 = Book("Sherlock Holmes", "Author Conon Doyle", "00-04")

    addBook(book4,bookCollection)

    displayCollection(bookCollection)

    removeBook("00-01",bookCollection)

    displayCollection(bookCollection)

    findBook("00-02",bookCollection)

    findByTitle("Intestellar",bookCollection)

    booksByAuthor("J. K. Rowling",bookCollection)

    displayCollection(bookCollection)
}@@

}

    
        



```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition Library is defined in
  D:/UCSC/Year 02/Y2S1/Functional Programming/Practicals/Practical 05/Q2.scala
and also in
  D:/UCSC/Year 02/Y2S1/Functional Programming/Practicals/Practical 05/Q2.scala
One of these files should be removed from the classpath.