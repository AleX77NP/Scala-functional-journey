object Currying {
   def main(args: Array[String]) = {

       println(doubleSum(2,2))
       println(curriedDoubleSum(2)(2))

       println(doubleSub(4,2))
       println(curriedDoubleSub(4)(2))
   }

   def doubleSum(x: Int, y:Int): Int = 2 * (x + y)

   def curriedDoubleSum(x:Int)(y: Int): Int = 2 * (x + y)

   val doubleSub: (Int, Int) => Int = (x, y) => 2 * (x - y)

   // doubleSubC : Int => Int => Inr = x => y => 2 * (x - y)

   val curriedDoubleSub: Int => Int => Int = doubleSub.curried
}