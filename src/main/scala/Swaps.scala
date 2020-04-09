import java.io.PrintWriter

object Swaps {


  // Complete the minimumSwaps function below.
  def minimumSwaps(arr: Array[Int]): Int = {
    var a = 0
    var count = 0

    for(a <- arr.indices){
      while(a + 1 != arr(a)){
        var temp = arr(a)
        arr(a) = arr(temp - 1)
        arr(temp - 1) = temp
        count = count + 1
      }
    }
    count
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
