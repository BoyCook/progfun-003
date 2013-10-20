object exercise {
  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double) {
    def isGoodEnough(guess: Double) = abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) = (guess + x / guess) / 2

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))    
  
    sqrtIter(1.0)      
  }


  sqrt(1)
  sqrt(2)
  sqrt(1e-1)
  sqrt(1e-2)
  sqrt(1e1)
  sqrt(1e5)

}

