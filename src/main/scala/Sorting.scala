class Sorting {

  //Bubble sort
  def bubbleSort(list: List[Int]): List[Int] = {
    def sortPass(lst: List[Int]): List[Int] = lst match {
      case Nil => Nil
      case head :: Nil => List(head)
      case head1 :: head2 :: tail =>
        if (head1 > head2) head2 :: sortPass(head1 :: tail)
        else head1 :: sortPass(head2 :: tail)
    }

    def iterate(lst: List[Int], length: Int): List[Int] = {
      if (length <= 0) lst
      else iterate(sortPass(lst), length - 1)
    }

    iterate(list, list.length)
  }

  //Selection sort
  def selectionSort(list: List[Int]): List[Int] = {
    def sortingList(unsorted: List[Int], sorted: List[Int]): List[Int] = {
      if (unsorted.isEmpty) sorted
      else {
        val min = unsorted.min
        val res = unsorted.filterNot(_ == min)
        sortingList(res, sorted :+ min)
      }
    }

    sortingList(list, List.empty[Int])
  }

  //Insertion sort
  def insertionSort(list: List[Int]): List[Int] = {
    def sortingList(sorted: List[Int], unsorted: List[Int]): List[Int] = {
      if (unsorted.isEmpty) sorted
      else {
        val element = unsorted.head
        val (left, right) = sorted.span(_ <= element)
        sortingList(left ::: element :: right, unsorted.tail)
      }
    }

    sortingList(List.empty[Int], list)
  }

}
