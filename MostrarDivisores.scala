

object MostrarDivisores {
  def calcularDivisores(x:Int, y:Int): Unit = {
    
   if(y<1){
    0 
   }
   else{
     if((x % y) == 0){
       print(y + " ")
     }
     calcularDivisores(x,(y-1))
   }
  }
  
  def main(args: Array[String]): Unit = {
    calcularDivisores(9,9)
  }
}