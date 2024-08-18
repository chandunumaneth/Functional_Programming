object stringFormatting {

    def toUpper(text : String) : String = text.toUpperCase()

    def toLower(text : String) : String = text.toLowerCase()

    def formatNames(name : String)(function : String => String) : String = function(name)

    @main def format : Unit = {

        val nameList : List[String] = List("Benny","Niroshan","Saman","Kumara")

        //Output BENNY
        println(formatNames(nameList(0))(toUpper))

        //Output NIroshan

        println(formatNames(nameList(1))(name => name.substring(0,2).toUpperCase() + name.substring(2)))

        //Output saman

        println(formatNames(nameList(2))(toLower))

        //Output KumarA

        println(formatNames(nameList(3))(name => s"${name.head.toUpper}${name.substring(1,name.length -1).toLowerCase()}${name.last.toUpper}"))
    }
}