fun main() {
    println("Ingrese un número para el tamaño del arreglo de Passwords")
    var canPasswords: Int? = readLine()?.toInt()
    var ArregloPasswords = canPasswords?.let { arrayOfNulls<Password>(it) }
    println("Ingrese el largo de las contraseñas: ")
    var tamano: Int? = readLine()?.toInt()

    var objeto = Password()
        if (tamano == null)
    {
        tamano = objeto.longitud
        var objeto = tamano?.let { Password(it) }

        var largo = 0
        if (ArregloPasswords != null) while (largo <= ArregloPasswords.size - 1)
        {
            ArregloPasswords[largo] = objeto

            //Array de booelanos
            var arrayBooleanos = canPasswords?.let { arrayOfNulls<Boolean>(it) }
            if (objeto != null) {
                arrayBooleanos?.set(largo, objeto.esFuerte(objeto.contraseña))
            }

            largo++

            if (objeto != null) {
                println("Contraseña: ${objeto.contraseña}, ${objeto.esFuerte(objeto.contraseña)}")
            }
        }
    }
    else {
        var largo = 0

        /*var longPassword = readLine()
       val lPassword = arrayOf(longPassword)

       for (i in lPassword)
       {
           var mipass: Password
           println("¿DESEA INTRODUCIR LA LONGITUD DEL PASSWORD?\n1. SI\n2.NO")
           var respuesta = readLine()
           if (respuesta == "1")
           {
               println("FAVOR DE INTRODUCIR LA LONGITUD DEL PASSWORD")
               var lPass = readLine().toString().toInt()
               mipass = Password(lPass)

           }
           else if (respuesta == "2")
           {
               mipass = Password()

           }
           else
           {
               println("FAVOR DE INTRODUCIR UNA OPCIÓN VÁLIDA")
           }
       }*/
        if (ArregloPasswords != null) while (largo <= ArregloPasswords.size - 1)
        {
            var objeto = tamano?.let { Password(it) }
            ArregloPasswords[largo] = objeto

            //Array de booelanos
            var arrayBooleanos = canPasswords?.let { arrayOfNulls<Boolean>(it) }
            if (objeto != null) {
                arrayBooleanos?.set(largo, objeto.esFuerte(objeto.contraseña))
            }

            largo++

            if (objeto != null) {
                println("Contraseña: ${objeto.contraseña}, ${objeto.esFuerte(objeto.contraseña)}")
            }
        }
    }
}