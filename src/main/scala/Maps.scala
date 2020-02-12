object Maps {
    var map = Map.empty[String, Integer]

    def getUserNumber(name: String) = {
      map.getOrElse(name, 0)
    }


    def main(args: Array[String]) {
      var n = scala.io.StdIn.readInt

      while(n != 0){
        val line = scala.io.StdIn.readLine.split(" ")
        map = map + (line(0) -> line(1).toInt)
        n = n - 1
      }

      var name = scala.io.StdIn.readLine

      while(name != null){
        val phone = getUserNumber(name)
        if(phone == 0) println("Not found")
        else println(s"$name=$phone")
        name = scala.io.StdIn.readLine
      }
    }
  }

