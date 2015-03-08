object Main {
  def main(args: Array[String]) = {
    println( getMessageImperative() )
    println( getMessageFunctional )
  }

  def getMessageImperative() : String = {
    return "Hello world";
  }

  def getMessageFunctional() : String = {
    "Hello again";
  }
}
