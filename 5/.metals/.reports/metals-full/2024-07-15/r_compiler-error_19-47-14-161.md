file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2005/Q2.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 1231
uri: file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2005/Q2.scala
text:
```scala
object LibraryManagement
{
    case class Book (title : String, author : String, isbn : String)

    val book1 = Book("Peaky Blinders", "Steven Knight" , "00-01")
    val book2 = Book("Harry Potter", "J. K. Rowling", "00-02")
    val book3 = Book("Intestellar", "Christopher Nolan", "00-03")

    var bookCollection : set[Book] = set(book1,book2,book3)

    def addBook(newBook : Book) : set[Book] = {
        bookCollection = bookCollection :+ newBook
    }

    def removeBook(ISBN : String) : Unit = {
        val bookRemoval = bookCollection.find(_.isbn == ISBN)

        bookRemoval match {
            case Some(book) => bookCollection = bookCollection :- book
                               println(s"\nBook with ISBN ${isbn} is removed!\n")

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

    def displayCollection(bookCollection : set[@@])




}
```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2607)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:94)
	scala.meta.internal.pc.SignatureHelpProvider$.$anonfun$1(SignatureHelpProvider.scala:48)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile(LinearSeq.scala:280)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile$(LinearSeq.scala:278)
	scala.collection.immutable.List.dropWhile(List.scala:79)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:426)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner