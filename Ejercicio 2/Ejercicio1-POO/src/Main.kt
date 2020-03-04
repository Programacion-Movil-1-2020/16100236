fun main()
{
    var obj: Cuenta
    var NombreTitular : String
    var CantidadInicial : Double

    do {
        println("Ingrese el nombre del titular")
        NombreTitular = readLine().toString()
        if(NombreTitular.equals("")){
            println("El nombre del titular no puede estar en blanco")
        }
       }while(NombreTitular.equals(""))
    obj = Cuenta(NombreTitular)

    println("\n¿Desea agregar alguna cantidad inicial a su cuenta?\n1.SI \n2.NO")
    var Opcion = readLine()
    if (Opcion.equals("1"))
    {
        println("Ingrese la cantidad")
        CantidadInicial = readLine().toString().toDouble()
        obj = Cuenta(NombreTitular, CantidadInicial)
    }
    else
    {
        println("NO SE AGREGARÁ CANTIDAD INICIAL A LA CUENTA\n")
    }


    do {
        println("\nSeleccione ahora alguna acción a realizar: \n1.AGREGAR DINERO A LA CUENTA \n2.RETIRAR DINERO DE LA CUENTA\n3.Salir")
        var Opcion1 = readLine()
        if (Opcion1.equals("1")) {
            println("Ingrese la cantidad que desea agregar")
            var Can = readLine().toString().toDouble()
            obj.Ingresar(Can)
        } else if (Opcion1.equals("2")) {
            println("Ingrese la cantidad que desea retirar")
            var Can = readLine().toString().toDouble()
            obj.Retirar(Can)

        } else if(Opcion1.equals("3")){
            println("Ha decidido terminar las operaciones.\n"+obj.toString())
        } else{
            println("E R R O R, favor de introducir una opción válida")
        }
    }while(!Opcion1.equals("3"))

}