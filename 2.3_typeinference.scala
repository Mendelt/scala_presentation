object Main {
  def main(args: Array[String]) = {
    println(getMessage)
    println(inferMessage)
  }

  def getMessage() : String = {
    "Hello world";
  }

  def inferMessage() = {
    "Hello again";
  }
}
