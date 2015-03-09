object Main {
  def add(a: Int)(b: Int) = a + b

  def main(args: Array[String]) = {
    
    val increment = add(1) _

    println("one plus one is " + add(1)(1))
    println("two incremented by one is " + increment(2))
  }
}
