

object MostrarCoscientes {
  def calcularCoscientes(x:Int, y:Int): Unit = {
    
   if(x<=0){
    0 
   }
   else{
     if((x % y) == 0){
       print(x/y)
     }
     calcularCoscientes(x,(y))
   }
  }
  
  def main(args: Array[String]): Unit = {
    calcularCoscientes(9,18)
  }
}