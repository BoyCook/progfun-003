import week3.{Nil, Cons, List}

/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 21:08
 */

object nth {

  def nth[T](n: Int, items: List[T]): T =
    if (items.isEmpty) throw new IndexOutOfBoundsException("Item not found")
    else if (n == 0) items.head
    else nth(n - 1, items.tail)

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
  nth(0, list)
  nth(1, list)
  nth(2, list)
//  nth(-1, list)
//  nth(4, list)







































}