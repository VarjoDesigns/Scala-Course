import scala.io.StdIn.readLine

object Compass extends App {

  // Define a Map for directions
  val directions = Map("N" -> "North","W" -> "West","S" -> "South","E" -> "East")

  // Ask for user input
  println("Where are you going (N/W/S/E)?")
  var direction = readLine()

  // Print the full name of the direction based on given abbreviation
  println("You are going to " + directions(direction))
}