object TestMethod extends App{

  def isValidString = (a: String) => (
    if (a.length > 5 && a.length <= 10){
      true
    } else {
      false
    }
  )

  val s1 = isValidString("Test")
  val s2 = isValidString("SecondTest")

  println(s1)
  println(s2)
}