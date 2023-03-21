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
    fun addNodo(e: Int ) {
        var nuevo = Nodo(e)
        if(this.l == null){
            this.l = nuevo
        }else {
            nuevo.sig = this.l
            this.l = nuevo
        }
    }

    override fun toString(): String {
        return "Lista(l=$l)"
    }

    /**
     * Crear funciones añadir y borrar ultimo
     */



}