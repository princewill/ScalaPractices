import java.io.PrintWriter

object Swaps {


  // Complete the minimumSwaps function below.
  def minimumSwaps(arr: Array[Int]): Unit = {
    var temp = 0
    var prev = (arr(0), 0)
    var swapCount = 0

    arr.zipWithIndex.foreach{
      case (value, index) =>
      if(value < prev._1) {
        arr(index) = prev._1
        arr(prev._2) = value
        prev = (value, index)
        swapCount = swapCount + 1
      }
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val res = minimumSwaps(arr)

    printWriter.println(res)

    printWriter.close()
  }

}
