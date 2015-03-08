object Main {
  class GreeterClass {
    def greet = println("Hello world from greeter class instance")
  }

  object GreeterObject {
    def greet = println("hello world from greeter object")
  }

  def main(args: Array[String]) = {
    GreeterObject.greet

    val greeter = new GreeterClass
    greeter.greet
  }
}

