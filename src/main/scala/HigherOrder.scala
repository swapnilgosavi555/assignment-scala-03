


object HigherOrderFunction extends App {
  println(HigherOrderFunction.getSum(getSumOfCubes, -2, 3))

  def getSum(f: (Int, Int) => Int, num1: Int, num2: Int): Int = {
    f(num1, num2)
  }

  def getSumOfSquares(num1: Int, num2: Int): Int = {
    num1 * num1 + num2 * num2
  }

  def getSumOfCubes(num1: Int, num2: Int): Int = {
    num1 * num1 * num1 + num2 * num2 * num2
  }

  def getSumOfInts(num1: Int, num2: Int): Int = {
    num1 + num2
  }
}