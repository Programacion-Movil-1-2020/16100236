class Auto() {
    var Marca = ""
    var Modelo = ""

    val Caracteristicas = mutableListOf<String>()
    val CaracteristicasEspeciales = mutableListOf<String>()
    val Autos = mutableListOf<String>()

    fun ensamblarAuto()//: MutableList<String>
    {
        print("INGRESE LAS CARACTERISTICAS PRINCIPALES")
        do {
            println("\n1.Transmisión Manual" + "\n2.Transmisión Automática" + "\n3.Aire Acondicionado" + "\n4.Frenos ABS" + "\n5.Bolsas de aire" + "\n6.Pantalla táctil" + "\n7.Controles Eléctricos \n8.TERMINAR")
            var resp1 = readLine().toString()
            when (resp1) {
                "1" -> Caracteristicas.add("Transmisión Manual")
                "2" -> Caracteristicas.add("Transmisión Automática")
                "3" -> Caracteristicas.add("Aire Acondicionado")
                "4" -> Caracteristicas.add("Frenos ABS")
                "5" -> Caracteristicas.add("Bolsas de aire")
                "6" -> Caracteristicas.add("Pantalla táctil")
                "7" -> Caracteristicas.add("Controles Eléctricos")
            }


        } while (resp1 != "8")

        println("\nINGRESE LAS CARACTERISTICAS ESPECIALES")
        do {
            println("1.Faros de niebla" + "\n2.Faros LED" + "\n3.Asientos de piel" + "\n4.Rines de 17 pulgadas" + "\n5.Cargador inalámbrico" + "\n6.Cámara de reversa" + "\n7.Monitoreo punto ciego\n8.TERMINAR")
            var resp1 = readLine().toString()
            when (resp1) {
                "1" -> CaracteristicasEspeciales.add("Faros de niebla")
                "2" -> CaracteristicasEspeciales.add("Faros LED")
                "3" -> CaracteristicasEspeciales.add("Asientos de piel")
                "4" -> CaracteristicasEspeciales.add("Rines de 17 pulgadas")
                "5" -> CaracteristicasEspeciales.add("Cargador inalámbrico")
                "6" -> CaracteristicasEspeciales.add("Cámara de reversa")
                "7" -> CaracteristicasEspeciales.add("Monitoreo punto ciego")
            }


        } while (resp1 != "8")
        //return Caracteristicas
        //return CaracteristicasEspeciales

    }


    fun verAuto()
    {

        println("Las caracteristicas principales son" + Caracteristicas)
        println("Las caracteristicas especiales son" +CaracteristicasEspeciales)

    }
}


