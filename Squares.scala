object Squares extends App {

  // Define the array
  val nums = Array(2, 6, 1, 4, 3, 7)

  // Use Map to calculate the square of every number in the array
 var squares = nums.map(x => x*x)

  // Print the sum of squares
  println("The sum of squares is " + squares.sum)
}
