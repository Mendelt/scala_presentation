object Main {

  class ExpensiveObject {
    println("Initializing expensive object")
  }

  def main(args: Array[String]) = {
    lazy val yawn = new ExpensiveObject

    println("Just initialized an expensive object... yawn!")
    
    lazy val snore = yawn

    println("Assigned it to another val.... snore!")

    val doIt = yawn
    val again = snore
  }
}
