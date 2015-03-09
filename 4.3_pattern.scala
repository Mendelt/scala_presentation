object Main {
  def sum(numbers: List[Int]) : Int = {
    numbers match {
      case head :: tail => head + sum(tail)
      case Nil => 0
    }
  }

  def main(args: Array[String]) = {
    
    val list = List(3, 4, 5, 18, 400, 212, 13, )
    
    println(sum(list))
  }
}
