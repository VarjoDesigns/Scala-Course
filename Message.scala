object Message extends App {
  def msgFunc(f: (String) => String, a: String) : String = f(a:String)

  val helloMsg = (a: String ) => ("Hello " + a)
  val goodbyeMsg = (a: String ) => ("Goodbye " + a)

  val s1 = msgFunc(helloMsg,"Lisa")
  val s2 = msgFunc(goodbyeMsg,"Lisa")

  println(s1)
  println(s2)
}