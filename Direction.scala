object Direction extends App {
  def direction (x: Int) : String = x match {
    case 0 => "North"
    case 1 => "West"
    case 2 => "South"
    case 3 => "East"
    case _ => "Invalid direction"
  }

  println(direction(2))
  println(direction(0))
  println(direction(7))
}
