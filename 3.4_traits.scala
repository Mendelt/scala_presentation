
object Birds {

  abstract class Bird {
    val name: String
    def fly() = println(name + " flying")
  }

  trait Swimming {
    val name: String
    def swim() = println(name + " swimming")
  }

  class Pigeon extends Bird {
    val name = "Pigeon"
  }

  class Duck extends Bird with Swimming {
    val name = "Duck"
  }

  def main(args: Array[String]) = {
    val pigeon = new Pigeon
    pigeon.fly
    
    val duck = new Duck
    duck.fly
    duck.swim

    val specialPigeon = new Pigeon with Swimming
    specialPigeon.swim
    
  }
}

