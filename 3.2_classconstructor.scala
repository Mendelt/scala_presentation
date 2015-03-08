object Main {

  class Greeter(message: String) {
    
    println(message)
    
    def this(message1 : String, message2: String) = this(message1 + " " + message2)

    def again = println(message + " again")
  }


  def main(args: Array[String]) = {
    val greeter = new Greeter("Hello world")
    greeter.again

    val greeter2 = new Greeter("Farewell", "cruel world")
  }
}
