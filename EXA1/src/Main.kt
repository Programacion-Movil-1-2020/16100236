fun main()
{

    var sion = ""
    var cont = 0

    val Autos = mutableListOf<Auto>()
    do
    {
        print("ELIGA UNA OPCIÓN \n1.ENSAMBLAR AUTO NUEVO\n2.VER AUTOS ENSAMBLADOS\n3.SALIR\n")
        var Opcion = readLine()?.toInt() as Int
        when (Opcion) {
            1 ->
            {
                do {
                    val carro = Auto()
                    println("Ingrese una Marca para este auto")
                    var marcaAuto = readLine()
                    carro.Marca = marcaAuto.toString()
                    println("Ingrese una Modelo para este auto")
                    var modeloAuto = readLine()
                    carro.Modelo = modeloAuto.toString()
                    carro.ensamblarAuto()
                    cont++
                    Autos.add(carro)
                    println("\nDesea ensamblar un auto nuevo?\n1.SI\n2.NO")
                    sion = readLine().toString()
                } while (!sion.equals("2"))
            }



            2 ->
            {
                Autos.forEach()
                {
                    var recib = it
                    recib.verAuto()

                    println("La marca del auto es:" + recib.Marca)
                    println("El modelo del auto es:" + recib.Modelo + "\n")

                }
                println("La cantidad de autos ensamblados es: " + cont + "\n")

            }
        }

    } while (Opcion != 3)
}
