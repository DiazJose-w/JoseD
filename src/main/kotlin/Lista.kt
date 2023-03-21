/**
 * En este ejercicio vamos a crear la clase NODOS!
 */
class Lista {
    class Nodo(var dato: Int) {
        var sig: Nodo? = null
    }

    var l : Nodo? = null

    /**
     * Crear funciones añadir y borrar primero
     */
    fun addDato(e: Int ) {
        var nuevo = Nodo(e)
        if(this.l == null){
            this.l = nuevo
        }else {
            nuevo.sig = this.l
            this.l = nuevo
        }
    }

    fun borrarDato(){
        this.l = this.l!!.sig
    }

    override fun toString(): String {
        var cad = "l -> "
        var aux = this.l
        while(aux != null){
            cad = cad + aux.dato + " -> "
            aux = aux.sig
        }
        cad = cad + "null"
        return cad
    }

    /**
     * Crear funciones añadir y borrar ultimo
     */



}