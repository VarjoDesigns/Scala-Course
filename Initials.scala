import scala.io.StdIn.readLine

object Initials {
  println("Type your firstname")
  var firstname = readLine()

  println("Type your lastname")
  var lastname = readLine()

  println("Your initials: " + firstname.charAt(0) + "." + lastname.charAt(0))
}