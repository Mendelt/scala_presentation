object Main {

  class Complex(val real: Float, val imag: Float) {

    def add(other: Complex) = new Complex(real + other.real, imag + other.imag)
    def +(other: Complex) = add(other)

    def print = println(real + " + " + imag + "i")
  }

  def main(args: Array[String]) = {
    val sum = new Complex(4,4).add(new Complex(3,3))
    sum.print

    val sum2 = new Complex(4,4) add new Complex(2,2)
    sum2 print

    val sum3 = new Complex(2,2) + new Complex(1,1)
    sum3 print
  }
}
