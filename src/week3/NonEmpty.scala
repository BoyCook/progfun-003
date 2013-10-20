package week3

/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 16:12
 */
class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def this(elem: Int) = this(elem, new Empty, new Empty)

  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
}
