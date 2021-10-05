object ReplaceScala extends App {
  // Create Scala program (ReplaceString.scala) that contain the following string value.
  val str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"

  // Use regular expression to replace all 'or' to 'OR'. Print the resulting string.
  val find = "or".r

  val res = find.replaceAllIn(str, "OR")
  println(res)
}
