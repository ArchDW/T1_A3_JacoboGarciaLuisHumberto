

object FuncionesRecursivas {
   
  //Funcion Recursiva
  def sumatoriaEnteros(numero: Int):Int = {
    if(numero == 0)
      0
    else
      return numero + sumatoriaEnteros(numero-1)
  }
  
  
  def main(args: Array[String]): Unit = {
    println(sumatoriaEnteros(5, 8))
  }
  
}