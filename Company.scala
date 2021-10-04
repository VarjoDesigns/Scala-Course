object Company extends App {
  var employee1 = new Employee("Lisa Smith")
  employee1.paySalary(2000)
  println(employee1.toString)
}

class Employee(var name: String) {
  override def toString: String = s"Hello $name"

  def printHello: Unit = {
    println("Hello " + name)
  }
  def paySalary(amount: Int) = {
    println("Salary paid: " + amount)
  }
}