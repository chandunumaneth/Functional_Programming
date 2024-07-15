object LibraryManagementSystem {
    case class Book (title : String, author : String, isbn : String)

    val book1 = Book("Peaky Blinders", "Steven Knight" , "00-01")
    val book2 = Book("Harry Potter", "J. K. Rowling", "00-02")
    val book3 = Book("Intestellar", "Christopher Nolan", "00-03")

    var bookCollection : Set[Book] = Set(book1,book2,book3)

    def addBook(newBook : Book) : Any = {
        if(bookCollection.exists(_.isbn == newBook.isbn))
            println(s"Book with ISBN ${newBook.isbn} already exists! Adding Failed!\n")
        else
        {
            bookCollection += newBook
            println(s"New Book with title ${newBook.title} added!\n")
        }
        
    }

    def removeBook(ISBN : String) : Unit = {
        val bookRemoval = bookCollection.find(_.isbn == ISBN)

        bookRemoval match {
            case Some(book) => bookCollection -= book
                               println(s"\nBook with ISBN ${ISBN} is removed!\n")

            case None => println("\nNo books were removed! No matches found with this ISBN!\n")
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
        
        matchCollection.zipWithIndex.foreach {
            case (book,index) => println(s"Book Number : ${index+1}\nBook Name : ${book.title}\nBook Author : ${book.author}\nBook ISBN : ${book.isbn}\n")
        }
    }

    def findByTitle(bookTitle : String) : Unit = {

        val bookOption = bookCollection.filter(_.title == bookTitle)

        if(bookOption.nonEmpty)
        {
            println(s"Book / Books with title $bookTitle found!\n")
            displayCollection(bookOption)
        }
        else
        {
            println(s"Book with title $bookTitle was not found!\n")             
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

        val book4 = Book("Sherlock Holmes", "Author Conon Doyle", "00-02")

        addBook(book4)

        displayCollection(bookCollection)

        removeBook("00-01")

        displayCollection(bookCollection)

        findBook("00-02")

        findByTitle("Intestella")

        booksByAuthor("J. K. Rowling")

        val book5 = Book("Fantastic Beasts", "J. K. Rowling", "00-05")

        addBook(book5)
        
    }

}

    
        


