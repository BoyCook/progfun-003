/**
 * User: boycook
 * Date: 16/10/2013
 * Time: 18:04
 */

object exercise2 {

  def id(x: Int): Int = x

  def cube(x: Int): Int = x * x * x

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))


  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)

  def fact(n: Int): Int = product(x => x)(1, n)

  product(x => x * x)(3, 4)
  fact(5)
  sum(cube)(1, 10)
  mapReduce(cube, (a, b) => a + b, 0)(1, 10)
}
