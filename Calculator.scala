object Calculator extends App {
  // This program should calculate the sum of first 20 natural numbers (positive integers)
  var total = 0
  var i = 0

  // For loop for counting
  for(i <- 1 to 20) {
    total = total + i
  }

  println("Sum = " + total)
}
