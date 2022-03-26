import scala.math._

object HoF {
   def main(args: Array[String]) = {
      println(calculate(5, sqaure))
      println(calculate(5, cube))
   }

   def calculate(number: Int, calcFun: Int => Int): Int = calcFun(number)

   def sqaure(number: Int): Int = number * number

   def cube(number: Int): Int = number * number * number

}