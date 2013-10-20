package week3

/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 20:47
 */
class Nil[T] extends List[T] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}
