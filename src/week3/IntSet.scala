package week3

/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 16:11
 */
abstract class IntSet {
  def contains(x: Int): Boolean
  def incl(x: Int): IntSet
}
