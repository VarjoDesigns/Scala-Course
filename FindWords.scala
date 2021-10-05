object FindWords extends App {
  val str = "Dolor aute irure dolor in reprehenderit in voluptate esse cillum dolor eu fugiat nulla pariatur."

  // Use regular expression to find amount of dolor or Dolor words from the string. The program prints the result.
  val m = "[Dd]olor".r

  val it = m.findAllIn(str)
  println("There are " + it.length + " Dolor or dolor words")
}
