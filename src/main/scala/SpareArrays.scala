import java.io.PrintWriter

object SpareArrays {

  // Complete the matchingStrings function below.
  def matchingStrings(strings: Array[String], queries: Array[String]): Array[Int] = {
    var stringCountMapping = Map.empty[String, Int]

    strings
      .map(s =>
        stringCountMapping.get(s)
          .map(va => stringCountMapping += (s -> (va + 1)))
          .getOrElse(stringCountMapping += (s -> 1))
    )
    queries.map(stringCountMapping.getOrElse(_, 0))

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val stringsCount = stdin.readLine.trim.toInt

    val strings = Array.ofDim[String](stringsCount)

    for (i <- 0 until stringsCount) {
      val stringsItem = stdin.readLine
      strings(i) = stringsItem}

    val queriesCount = stdin.readLine.trim.toInt

    val queries = Array.ofDim[String](queriesCount)

    for (i <- 0 until queriesCount) {
      val queriesItem = stdin.readLine
      queries(i) = queriesItem}

    val res = matchingStrings(strings, queries)

    printWriter.println(res.mkString("\n"))

    printWriter.close()
  }
}
