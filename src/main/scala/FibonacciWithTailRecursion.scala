
object FibonacciWithTailRecursion extends App {
  FibonacciWithTailRecursion.getFibonacci(7)

  def getFibonacci(number: Int): Int = {
    def getFibonacciWithTailRecursion(number: Int, prev: Int = 0, next: Int = 1): Int = {
      number match {
        case 0 => 0
        case _ => println(prev)
          getFibonacciWithTailRecursion(number - 1, next, (next + prev))
      }
    }

    getFibonacciWithTailRecursion(number)
  }
}

