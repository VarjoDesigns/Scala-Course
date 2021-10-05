import scala.io.StdIn.readInt
import scala.util.Try

object HandleErrors extends App {

  def readInteger() : Unit = {
    try {
      println("Type an integer")
      val userint = readInt()
      val isInteger = Try(userint.toString).isSuccess
      println("You typed " + userint)
    } catch {
      // If Failure
      case e: NumberFormatException => println("That wasn't integer")
    }
  }

  readInteger()
}

/*

Create a Scala program (HandleErrors.scala) that asks user to type an integer.
Create a method called readInteger that uses scala.io.readInt method to read user input.
Use Try to catch errors when reading the user input.
Call the readInteger method and use match expression to check the return value.
If the return value is an instance of Success, print 'You typed {typed_number}'.
In the case of Failure, print 'That wasn't integer'.

*/