import java.io.File
import java.io.PrintWriter
import scala.io.Source

object LanguageProgram extends App {
  val languages = Array("Java", "Perl", "Python", "Scala", "C#")

  val myFile = new File("")
  val myWriter = new PrintWriter(myFile)
  languages.foreach(x => myWriter.write(x + "\n"))

  val readFile = Source.fromFile("")
  for (line <- readFile.getLines) {
    println(line)
  }
}
