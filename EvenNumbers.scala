object EvenNumbers extends App {

  // Create an array
  var numbers = Array(1, 4, 6, 13, 16, 17, 22, 31, 33, 37)

  // Filter array to get the amount of even numbers in the array
  var evens = numbers.filter(x => x % 2 == 0)
  var odds = numbers.filter(x => x % 2 == 1)

  // Print the amount of even and uneven numbers
  println("The amount of even numbers is " + evens.length)
  println("The amount of odd numbers is " + odds.length)

}