import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class SortingTest extends AnyFlatSpec {

  val sortList = new Sorting()

  "Bubble sort" should "sort the list" in {
    sortList.bubbleSort(List(5, 2, 8, 1, 9, 4)) shouldEqual List(1, 2, 4, 5, 8, 9)
  }

  "Selection sort" should "sort the list" in {
    sortList.selectionSort(List(5, 2, 8, 1, 9, 4)) shouldEqual List(1, 2, 4, 5, 8, 9)
  }

  "Insertion sort" should "sort the list" in {
    sortList.insertionSort(List(5, 2, 8, 1, 9, 4)) shouldEqual List(1, 2, 4, 5, 8, 9)
  }
}
