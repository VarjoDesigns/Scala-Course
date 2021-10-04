object Company extends App {
  var employee1 = new Employee("Lisa Smith")
  employee1.paySalary(2000)
  println(employee1.toString)

  var manager1 = new Manager("Mary Poppins", 12345)
  manager1.payBonus(500)
  println(manager1.toString)
}

class Employee(var name: String) {
  def printHello: Unit = {
    println("Hello " + name)
  }
  def paySalary(amount: Int) = {
    println("Salary paid: " + amount)
  }

  override def toString: String = s"Hello $name"
}

class Manager(name: String, var managerId: Int) extends Employee(name) {
  def payBonus(amount: Int) : Unit = {
    println("Bonus paid: " + amount)
  }

  override def toString: String = s"Manager $managerId"
}


/*

Add new class called Manager into the file that inherits Employee class.

The Manager class has one extra string variable called managerId.
The class contains a method payBonus(amount: Int) and it prints the text "Bonus paid: {amount}".
Override also the toString method and it should print "Manager {managerId}"

Create one employee object using the name "Lisa Smith" and call the paySalary method passing 2000 as an argument.
Finally, call the toString method.

Create one manager object using the name "Mary Poppins" and mangerId 12345.
Call the payBonus passing 500 as an argument. Finally, call the toString method.

 */