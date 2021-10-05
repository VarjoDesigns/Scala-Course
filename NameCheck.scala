import scala.io.StdIn.readLine

object NameCheck extends App {
  println("Enter your firstname")
  var addedname = readLine()
  val cap = "[A-Z][a-z]".r

  // Let's see if the regex matches the added name
  cap.findFirstIn(addedname) match {
    case Some(_) => println("Hello " + addedname)
    case None => println("Name is invalid")
  }
}

/*
Create Scala program (NameCheck.scala) that asks firstname and check if that is valid.
The typed firstname should start with capital letter followed by at least one lower case letter (no digits).

If the names is valid, the program prints 'Hello typed_name', otherwise it prints 'Name is invalid'
 */