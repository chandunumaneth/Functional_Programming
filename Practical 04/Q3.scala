def toUpper(input: String): String = input.toUpperCase()

def toLower(input: String): String = input.toLowerCase()

def formatNames(name: String)(formatFunc: String => String): Unit = {
  println(formatFunc(name))
}

@main def NameFormat(): Unit = {
  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  formatNames("Benny")(toUpper)
  formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase() + name.substring(2))
  formatNames("Saman")(toLower)
  formatNames("Kumara")(name => name.substring(0,1).toUpperCase() + name.substring(1, name.length() - 1) + name.last.toUpper)
}
