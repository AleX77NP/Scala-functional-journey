object Paf {
   def main(args: Array[String]) = {
      val onlyDadBudget = calculateFamilyBudget(1020, _)
      val totalBudget = onlyDadBudget(470)

      println(totalBudget)
   }

   def calculateFamilyBudget(dadSalary: Double, momSalary: Double): Double = {
       dadSalary + momSalary
   }
}