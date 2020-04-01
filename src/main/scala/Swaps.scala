import java.io.PrintWriter

object Swaps {


  // Complete the minimumSwaps function below.
  def minimumSwaps(arr: Array[Int]): Unit = {


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
