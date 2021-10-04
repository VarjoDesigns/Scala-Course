import scala.io.StdIn.readInt

object Greatest extends App {
  println("Enter integer 1")
  var a = readInt()
  println("Enter integer 2")
  var b = readInt()
  println("Enter integer 3")
  var c = readInt()

  var greatest = a
  if (greatest < b) { greatest = b}
  if (greatest < c) { greatest = c}
  else {greatest = greatest}

  println("Greatest = " + greatest)
}
