/*
 * Nombre: Kristopher Javier Alvarado López
 * Carné: 21188
 * Curso: Programación plataformas móviles
 * Docente: Francisco Anzueto
 */

import org.junit.Test
import kotlin.test.*


data class ItemData(
    var originalPos: Int,
    var originalValue: Any,
	var type: String? = null,
    var info: String? = null
)
// -----------------------

fun main() {
    val result = processList(listOf(25, "Hola", null, false))
    println(result)
}

fun processList(inputList: List<Any?>?): List<ItemData>? {
	var listaFinal = ArrayList<ItemData>()
  var info = ""
  var contadorN:Int? = inputList?.size
  var contador:Int = contadorN!!
  contador -= 1
	  
  for(i in 0..contador){
      var e = inputList?.get(i)
      when (e) {
 		is String->{
            info = "l" + e.length.toString()
            listaFinal.add(ItemData(i,e,"cadena",info))
        } 
   		is Int ->{
            if(e%10==0){
                info = "m10"
                listaFinal.add(ItemData(i,e,"entero",info))
            }else if(e%5==0){
                info = "m5"
                listaFinal.add(ItemData(i,e,"entero",info))
            }else if(e%2==0){
                info = "m2"
                listaFinal.add(ItemData(i,e,"entero",info))
            }else{
                listaFinal.add(ItemData(i,e,"entero",null))
            }
        }
 		is Boolean ->{
            if(e==true){
                info = "verdadero"
                listaFinal.add(ItemData(i,e,"booleano",info))
            }else{
                info = "falso"
                listaFinal.add(ItemData(i,e,"booleano",info))
            }
        }
  		else ->{
            
           if(e!= null){
                e = (e?:0)
            	listaFinal.add(ItemData(i,e,null,null))
            }
            
            
        }
 	}
     
      
  }  
  
  return listaFinal
}

fun processListN(inputList: List<Any?>?): List<ItemData?>? {
    
    var listaN:List<ItemData?>? = null
    
    if(inputList == null){
      
      println("p")
      //listaFinal = (null)
      return listaN
  }  
    
    return listaN
}