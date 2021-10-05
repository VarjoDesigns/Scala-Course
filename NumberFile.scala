import java.io.File
import java.io.PrintWriter
import scala.io.Source

object NumberFile extends App {
  val nums = Array(5, 3, 12, 7, 8, 21, 1, 14, 17)
  val t1 = nums.filter(_ > 10)

  val myFile = new File("")
  val myWriter = new PrintWriter(myFile)

  t1.foreach(num => myWriter.write(num + "\n"))
  myWriter.close()

  val readFile = Source.fromFile("")
  for (line <- readFile.getLines) {
    println(line)
  }
}

/*

Create Scala program (NumberFile.scala) that contains the following array.

val nums = Array(5, 3, 12, 7, 8, 21, 1, 14, 17)

Use filter method to create a new array that contains only numbers from the nums array, that are greater than 10.
Then, create a file called nums.txt (without any path) and write the content of the filtered array into the file.

 */