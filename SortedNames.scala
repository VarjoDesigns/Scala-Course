import scala.io.StdIn.readLine
import scala.collection.mutable.ArrayBuffer

object SortedNames extends App {

  // Create an array
    // I'm using ArrayBuffer so that i don't have to predefine the length of the array
  var names = new ArrayBuffer[String]()

  // Import names
  println("Enter name")
  var addedname = readLine()
  names += addedname

  println("Enter name")
  addedname = readLine()
  names += addedname

  println("Enter name")
  addedname = readLine()
  names += addedname

  // Print the first name of the array (alphabetically)

  names = names.sorted
  println("The first in alphabetical order is: " + names(0))

}
