object Filtering extends App {
  // Set the array
  var nums = Array(2, 6, 1, 9, 3, 12, 21, 5, 16)

  // Filter only the numbers from the original array, that are greater than 6

  // Use for loop to print out values
  for (i <- 1 to nums.length) {
    if(nums(i-1) > 6){
      println(nums(i-1))
    }
  }
}

// Viope wants "if" for the code to pass...
/*
Originally I used a filter & only printed out its results

  var nums2 = nums.filter(x => x > 6)

  // Use for loop to print out values
  for (i <- 1 to nums2.length) {
    println(nums2(i-1))
  }
 */