object Closures {
   def main(args: Array[String]) = {
      
      val name = "Aleksandar"

      def checkIfMyNameIsLong(): Boolean = {
          return name.length > 5
      }

      println(checkIfMyNameIsLong())
   }
}