

object ArrayManipulation {

  // Complete the arrayManipulation function below.
  def arrayManipulation(n: Int, queries: Array[Array[Int]]): Long = {
    val arr = Array.fill[Long](10)(0)
    var max = 0L

    queries.foreach{ array => resolveQuery(array) }

    def resolveQuery(query: Array[Int]): Unit = {
      for(i <- (query.head -1) to (query(1) - 1)){
        arr(i) = arr(i) + query(2)
        if (arr(i) > max) max = arr(i) else max
      }
    }

    max
  }

  def main(args: Array[String]) {

    val result = arrayManipulation(2, Array(4, 3, 1, 2))

    println(result)

  }
}

