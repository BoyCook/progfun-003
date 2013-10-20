package week3

/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 20:35
 */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
