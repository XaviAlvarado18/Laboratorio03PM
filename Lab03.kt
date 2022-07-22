/*
 * Nombre: Kristopher Javier Alvarado López
 * Carné: 21188
 * Curso: Programación plataformas móviles
 * Docente: Francisco Anzueto
 */
fun main(args: Array<String>) { //Función principal
    val result = processList(listOf(25, "Hola", null, false)) //Se llama al método proccessList donde se crean las listas
    println(result)                                           //Se imprime dicha lista con los resultados correspondientes
}
data class ItemData( //Se crea la clase ItemData
    var originalPos: Int, //Se crean los atributos de dicha clase
    var originalValue: Any,
    var type: String? = null,
    var info: String? = null
)
fun processList(inputList: List<Any?>?): List<ItemData>? {
    if(inputList == null){ return null }
    var listaFinal = ArrayList<ItemData>()
    var listaN: List<ItemData?>? = null
    var contadorN:Int? = inputList?.size
    var contador:Int = contadorN!!
    for(i in 0..contador-1){ var e = inputList?.get(i)
        when (e) {is String->{listaFinal.add(ItemData(i,e,"cadena","l"+e.length.toString()))
        }is Int ->{ if(e%10==0){ listaFinal.add(ItemData(i,e,"entero","m10"))
        }else if(e%5==0){ listaFinal.add(ItemData(i,e,"entero","m5"))
        }else if(e%2==0){ listaFinal.add(ItemData(i,e,"entero","m2"))
        }else{ listaFinal.add(ItemData(i,e,"entero",null)) } }is Boolean ->{ if(e==true){ listaFinal.add(ItemData(i,e,"booleano","verdadero")) }else{ listaFinal.add(ItemData(i,e,"booleano","falso")) } }else ->{if(e!= null){ e=(e?:0)
            listaFinal.add(ItemData(i,e,null,null)) } } } }

    return listaFinal
}