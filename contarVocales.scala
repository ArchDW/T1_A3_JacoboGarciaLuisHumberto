import sun.applet.Main


object contarVocales {
    var contador 
    def contar(cad:String): Unit = {
      if(cad.length == 1){
        if ((cad.charAt(0)=='a') || (cad.charAt(0)=='e') || (cad.charAt(0)=='i') || (cad.charAt(0)=='o') || (cad.charAt(0)=='u')){
          contador += 1
        }
      }else{
        if ((cad.charAt(0)=='a') || (cad.charAt(0)=='e') || (cad.charAt(0)=='i') || (cad.charAt(0)=='o') || (cad.charAt(0)=='u')){
          contador += 1

          contar(cad.substring(0))
        }else{

          contar(cad.substring(0))
        }
      }
    }
        
    def main(args: Array[String]): Unit = {
      contar("hola")
    }
    
}