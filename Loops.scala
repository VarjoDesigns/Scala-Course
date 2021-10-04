object Loops extends App {

  // Create the array
  val nums = Array(1,4,7,10,13)
  val i = nums.iterator

  // Use For loop to print them out
  for (num <- nums) {
    println(num)
  }
}
