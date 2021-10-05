object PhoneCheck extends App {
  val format = "\\+\\d{3}-\\d{2}-\\d{6}".r

  val n1 = "+358-40-123324"
  val n2 = "-358-40-123324"
  val n3 = "+358-40-123789757"
  val n4 = "+358-40-12A3324"

  def checkNumber(str: String) : Boolean = {
    if (format.matches(str)) {
      true
    } else {
      false
    }
  }

  println(checkNumber(n1))
  println(checkNumber(n2))
  println(checkNumber(n3))
  println(checkNumber(n4))
}

/*
Create Scala program (PhoneCheck.scala) that checks if the phone number is valid.
The program contains method called checkNumber that gets phone numbers as parameter and
returns true if the phone number is valid, otherwise it returns false.

The format of the valid phone number is:
+XXX-XX-XXXXXXX, where X is digit (0-9).
The length of the last digit part XXXXXXX should be between 5-7 (inclusive).

Call the method four times in the program by passing the following phone numbers
to checkNumbers method and print out the returned boolean value.

+358-40-123324
-358-40-123324
+358-40-123789757
+358-40-12A3324

 */
