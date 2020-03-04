public class Cuenta(var Tit : String)
{
    //Atributos
    var Cantidad = 0.0
    get()
    {
        return field
    }
    set(value)
    {
        field = value
    }

    var Titular = ""
        get()
        {
            return field
        }
        set(value)
        {
            field = value
        }


    constructor(Titular: String, Cantidad:Double): this(Titular)
    // para definir un constructor secundario, debo poner la palabra "constructror" y hacer refrencia al primario con "this"
    {
        this.Titular = Titular
        this.Cantidad = Cantidad
    }


    override fun toString(): String
    {
        return "Titular: $Titular" +
                "\nCantidad: $$Cantidad"
    }

    fun Ingresar (Can : Double)
    {
        if (Can < 0)
        {
            println("\nE R R O R, LA CANTIDAD A INGRESAR NO PUEDE SER NEGATIVA")
            println("SALDO ACTUAL:" + Cantidad)

        }
        else
        {
           Cantidad = Cantidad + Can
            println("\nCANTIDAD INGRESADA CORRECTAMENTE\nSALDO ACTUAL:" + Cantidad)
        }

    }

    fun Retirar (Can : Double)
    {
        if ((Cantidad - Can) < 0)
        {
            this.Cantidad = 0.0
            println("\nLA CANTIDAD INTRODUCIDA NO PUEDE SER RETIRADA, SALDO ACTUAL:" + Cantidad)
        }
        else
        {
            Cantidad = Cantidad - Can
            println("\nCANTIDAD RETIRADA CORRECTAMENTE\nSALDO ACTUAL:" + Cantidad)
        }

    }

}




