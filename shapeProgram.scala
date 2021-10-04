object ShapeProgram extends App {
  sealed trait Shape

  case class Square(height: Int, width:Int) extends Shape
  case class Circle(radius: Int) extends Shape

  def shapeInfo(phone: Shape): Unit = {
    phone match {
      case Square(height, width) => println("This is square")
      case Circle(radius) => println("This is circle")
      case _ => println("Unknown shape")
    }
  }

  val shape1 = Square(5, 2)
  val shape2 = Circle(10)
  shapeInfo(shape1)
  shapeInfo(shape2)
}
