import scala.io.StdIn.readInt

object ArrayElement extends App {
  println("Type an index")
  var usrint = readInt()

  try {
    val arr = Array(1, 2, 3)
    println(arr(usrint))
  }
  catch {
    case e: IndexOutOfBoundsException => println("Element doesn't exist")
  }
}

/*

Create Scala program (ArrayElement.scala) that asks user to type an index.
The program contains the following array

val arr = Array(1, 2, 3)
Print an element in the given index. Use try-catch to handle exceptions.
In the case of exception, print out 'Element doesn't exist'.

 */