object Initials2 {
  def printInitials(firstname: String = "John", lastname: String = "Smith"): String =  {
    var a = firstname.charAt(0) + "." + lastname.charAt(0)
    println(a)
    return a
  }
  printInitials()
}
