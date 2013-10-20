import week3.Rational

/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 18:32
 */

object scratch {
  new Rational(1, 2)

  def error(msg: String) = throw new Error(msg)

  val x = null
  val y: String = x
//  val z: Int = null // invalid
}