import scala.io.StdIn.readInt

object Factorial extends App {
  // This Scala program calculates the factorial of any given integer
  // Factorial is calculated by multiplying all whole numbers from given number down to 1

  println("Type the integer:")
  var userint = readInt()
  var x = 1

  // For loop that counts factorial
  for (i <- 1 to userint) {
    x = x * i
  }

  println("The factorial of " + userint + " is " + x)
}
