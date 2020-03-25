import scala.annotation.tailrec
import scala.collection.mutable

object NewYearChaos {


  // Complete the minimumBribes function below.
  def minimumBribes(q: Array[Int]) = {
    var min = mutable.ArraySeq.empty[Int]
    var count = 0
    var index = 0

    q.foreach(re => min :+ re)

    def sorted(g: mutable.ArraySeq[Int]): Boolean = {
      var isSorted = true
      g.zipWithIndex.foreach{case (value, index) =>
        if(value != (index - 1)) isSorted = false
      }
      isSorted
    }

    while(!sorted(min)){
      loop(min, q(index))
      index = index + 1
    }

    @tailrec
    def loop(ar: mutable.ArraySeq[Int], value: Int): mutable.ArraySeq[Int] = {
      min = ar
      var temp = 0
      val index = min.indexOf(value)
      val rValue = value - 1

      if (rValue == index) {
        min
      }
      else {
        count = count + 1
        temp = min(rValue)
        min(rValue) = value
        min(index) = temp
        loop(min, temp)
      }
    }

    println(count)

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt

      val q = stdin.readLine.split(" ").map(_.trim.toInt)
      minimumBribes(q)
    }
  }

}
