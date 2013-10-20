import week3.NonEmpty

/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 15:49
 */

object intsets {

  val t1 = new NonEmpty(3)
  val t2 = t1 incl 4
  val t3 = t1 union t2
}
