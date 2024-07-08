file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2004/Q1.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 118
uri: file:///D:/UCSC/Year%2002/Y2S1/Functional%20Programming/Practicals/Practical%2004/Q1.scala
text:
```scala
val bookNames[String] = ("Harry Potter","Peaky Blinders","Sherlock Holmes","Adventures of Tin Tin")
val bookQuantity[@@]= (1,23,10,7)

def displayInventory (array1 : Array[String],array2 : Array[Int]) : Any = {
    println("Available books and available book count ;");
    println(s"${array1.head} -> ${array2.head}")
    println()
    if(array1.nonEmpty && array2.nonEmpty)
    {
        displayInventory(array1.tail,array2.tail)
    }
    else
    {
        println("\nAbove listed are the available inventory!")
    }
}

object MyApp extends App()
{
    displayInventory(bookNames,bookQuantity)
}
```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2607)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:96)
	scala.meta.internal.pc.SignatureHelpProvider$.$anonfun$1(SignatureHelpProvider.scala:48)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile(LinearSeq.scala:280)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile$(LinearSeq.scala:278)
	scala.collection.immutable.List.dropWhile(List.scala:79)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:426)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner