import scala.collection.mutable.ListBuffer

object HourGlassSum {

  var max: ListBuffer[Int] = scala.collection.mutable.ListBuffer.empty[Int]


  def findSum(i: Int, j: Int, arr: Array[Array[Int]]): ListBuffer[Int] = {
    var tempMax =
      arr(i)(j) + arr(i)(j + 1) + arr(i)(j + 2) +
        arr(i + 1)(j+1) +
        arr(i + 2)(j) + arr(i + 2)(j + 1) + arr(i + 2)(j + 2)
    max += tempMax
  }




  // Complete the hourglassSum function below.
  def hourglassSum(arr: Array[Array[Int]]): Int = {
    for{
      i <- 0 until 4
      j <- 0 until 4
    } yield findSum(i, j, arr)

    max.max

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val arr = Array.ofDim[Int](6, 6)

    for (i <- 0 until 6) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = hourglassSum(arr)

    println(result)

  }
}

