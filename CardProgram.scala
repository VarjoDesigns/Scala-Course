object CardProgram extends App {

  // Define the cards
  val c1 = new Card("Heart", 5)
  val c2 = new Card("Clubs", 2)
  val c3 = new Card("Spade", 9)
  val c4 = new Card("Heart", 8)
  val c5 = new Card("Spade", 3)
  val c6 = new Card("Clubs", 4)

  // Create an array, and add cards into the array
  var a1 = Array[Card](c1,c2,c3,c4,c5,c6)
  var x = 0

  for(x <- 1 to 6) {
    if (a1(x-1).get_name == "Heart") {
      println("Card: " + a1(x-1).get_num + " " + a1(x-1).get_name)
    }
  }
}

class Card (suit: String, num: Int) {
  override def toString: String = s"Card: $num $suit"

  def get_name: String = { suit }
  def get_num: Int = { num }
}