import scala.io.StdIn.readInt

object Square extends App{

  val square = (a:Int) => a*a

  println("Type an integer")
  var typedint = readInt()
  println("Square = " + square(typedint))
}
