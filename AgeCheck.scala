import scala.io.StdIn.readInt

object AgeCheck extends App {
  println("What is your age?")
  var typedint = readInt()

  if (typedint >= 18) {
    println("Welcome")
  } else {
    println("You're too young")
  }
}
