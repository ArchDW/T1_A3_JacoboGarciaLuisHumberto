
  object CalcularFactorial {
   def Factorial(x:Int): Int = {
    
   if(x == 0){
    1
   }
   else{
     return x * Factorial(x-1)
   }
  }
  
  def main(args: Array[String]): Unit = {
    println(Factorial(11))
  }

}