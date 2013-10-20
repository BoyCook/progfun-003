package week3

/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 16:12
 */
object Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  def union(other: IntSet): IntSet = other
  override def toString = "."
}
