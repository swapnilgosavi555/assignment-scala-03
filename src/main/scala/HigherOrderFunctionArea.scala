
object HigherOrderFunctionArea extends App {
  println(HigherOrderFunctionArea.area("rectangle", 5, 4, getRectangleArea))

  def area(shape: String, first: Int, second: Int, f: (Int, Int) => Int): String = {
    shape match {
      case "rectangle" => s"Area of rectangle is ${f(first, second)}"

      case "parallelogram" => s"Area of parallelogram is ${f(first, second)}"

      case "rhombus" => s"Area of rhombus is ${f(first, second)}"

      case _ => s"Not defined yet for  ${shape}"
    }
  }

  def getRectangleArea(length: Int, breadth: Int): Int = {
    length * breadth
  }

  def getRhombusArea(diagonal1: Int, diagonal2: Int): Int = {
    (diagonal1 * diagonal2) / 2
  }

  def getParallelogramArea(base: Int, height: Int): Int = {
    base * height
  }
}
