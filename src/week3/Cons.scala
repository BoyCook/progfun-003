package week3

/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 20:37
 */
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}
