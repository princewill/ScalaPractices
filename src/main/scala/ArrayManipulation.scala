

object ArrayManipulation {

  // Complete the arrayManipulation function below.
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    val arr = Array.fill[Long](n + 2)(elem = 0)
    var max = 0L

    queries.foreach{ array =>
      arr(array(0)) = arr(array(0)) + array(2)
      arr(array(1) + 1) =  arr(array(1) + 1) - array(2)
    }

    def getMaxWithPrefixSum(array: Array[Long]): Long = {
      var sum = 0L
      for(i <- array.indices){
        sum = sum + arr(i)
        arr(i) = sum
        if (sum > max) max = sum else max
      }
      max
    }

    getMaxWithPrefixSum(arr)
  }

  def main(args: Array[String]) {

    val result = arrayManipulation(2, Array(4, 3, 1, 2))

    println(result)

  }
}

