object OwnSorting extends App {

  // Create the original array
  var names = List("Elisabeth", "Mike", "Lisa", "Annie", "John", "Layla")

  // Sort the list according to second character of the names
  val names2 = names.sortBy(name => name.charAt(1))

  // Print the sorted list
  println(names2)
}
