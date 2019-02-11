

object ContarDivisores {
  def Divisores(x:Int, y:Int): Unit = {
   var cont = 0
   if(y<1){
    0
    cont = 0
   }
   else{
     if((x % y) == 0){
       cont = cont + 1
       println(cont)
     }
     Divisores(x,(y-1))
   }
  }
  
  def main(args: Array[String]): Unit = {
    Divisores(9,9)
  }
}