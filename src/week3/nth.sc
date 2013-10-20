/**
 * User: boycook
 * Date: 20/10/2013
 * Time: 21:08
 */

object nth {

  def itemAtIndex[T](index: Int, items: List[T]): T =
    if (index < 0 || index > items.length -1) throw new IndexOutOfBoundsException("Item.itemAtIndex.outOfBounds")
    else items(index)

  itemAtIndex(0, List(1, 2, 3))
  itemAtIndex(1, List(1, 2, 3))
  itemAtIndex(2, List(1, 2, 3))

}