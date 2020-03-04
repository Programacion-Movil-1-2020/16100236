import kotlin.random.Random

class Password() {
    //Atributos
    var longitud = 8
       set(value)
       {
            field = value
        }


    var contraseña = ""
        get() {
            return field
        }
        set(value) {
            field = generarPassword(longitud)//cambio a las 12:14, revisar
        }

    constructor(longitud: Int) : this() //
    {
        this.longitud = longitud
        this.contraseña = generarPassword(longitud)
    }

    override fun toString(): String {
        return "Titular: $longitud" +
                "\nCantidad: $$contraseña"
    }

    fun esFuerte(cont: String): Boolean {
        var mayusculas = 0
        var minusculas = 0
        var numeros = 0

        val contA = cont.toCharArray()

        for (car in 1..contA.size-1)
        {
            if (contA[car].toInt() in 65..90)
                mayusculas ++
            if (contA[car].toInt() in 97..122)
                minusculas ++
            if (contA[car].toInt() in 48..57)
                numeros ++
        }

        return (mayusculas >= 2 && minusculas >=1) && numeros >= 5
    }



    fun generarPassword(long: Int): String
    {
        var contra = ""
        for (car in 1..long)
        {
            when (Random.nextInt(1, 4))
            {
                1 -> contra += Random.nextInt(65, 90).toChar()
                2 -> contra += Random.nextInt(97, 122).toChar()
                3 -> contra += Random.nextInt(48, 57).toChar()

            }

        }
        return contra
    }
}






