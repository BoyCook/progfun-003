/**
 * User: boycook
 * Date: 16/10/2013
 * Time: 19:44
 */

object exercise1 {
  def abs(x: Double) = if (x < 0) -x else x

  val tolerance = 0.00001

  def isCloseEnough(x: Double, y: Double): Boolean = abs((x - y) / x) / x < tolerance

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }

  def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1.0)
  def crt(x: Double) = fixedPoint(averageDamp(y => x / (y * y) ))(1.0)
  sqrt(2)
  sqrt(16)
  crt(24)

  /*
     Square root
     x = y * y
     y = x / y

     Cube root
     x = y * y * y
     y = x / y * y
   */

}

