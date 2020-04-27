
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

    val res = minimumSwaps(Array(4, 3, 1, 2))

    println(res)
  }

}
