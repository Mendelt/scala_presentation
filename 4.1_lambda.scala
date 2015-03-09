object Main {
  def main(args: Array[String]) = {

    val generateGreeting: (String, Int) => String = (message, times) => message * times
    var greet = (message: String) => println(message)

    greet(generateGreeting("Hello World! ", 5))
  }
}
