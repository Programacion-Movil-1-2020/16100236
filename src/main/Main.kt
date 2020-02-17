fun main(arg: Array<String>) {
    var Opcion: Int
    var TipoProc = ""
    var MemoriaRAM = ""
    var TamañoRAM = ""
    var TipoDD = ""
    var TamañoDD = ""

    val Ensamble = mutableListOf<String>();
    do
    {
        print("Escoja una opción:\n" + "1.- Armar un nuevo equipo\n" + "2.- Ver equipos armados\n" + "3.- Salir\n ")
        Opcion = readLine()?.toInt() as Int
        when (Opcion)
        {
            1 -> {
                do {
                    print("\nEscoja un componente:\n" + "1.- Procesador\n" + "2.- Memoria Ram\n" + "3.- Disco duro\n" + "4.- Regresar\n")
                    Opcion = readLine()?.toInt() as Int
                    when (Opcion)
                        {
                        1 -> {
                            print("\nSelecciona un procesador:\n" + "1.- Intel Core i3\n" + "2.- Intel Core i5\n" + "3.- Intel Core i7\n")
                            Opcion = readLine()?.toInt() as Int
                            when (Opcion){
                                1-> {TipoProc = "Intel Core i3"}
                                2-> {TipoProc = "Intel Core i5"}
                                3->{TipoProc = "Intel Core i7" }
                            }
                        }
                        2 ->
                        {
                            print("\nSelecciona una tipo de Memoria RAM:\n" + "1.- DDR\n" + "2.- DDR2\n" + "3.- DDR3\n")
                            Opcion = readLine()?.toInt() as Int
                            when (Opcion){
                                1-> {
                                    MemoriaRAM = "DDR"
                                    print("\nSelecciona el tamaño de la RAM:\n" + "1.- 8GB\n" + "2.- 12GB\n" + "3.- 16GB\n")
                                    Opcion = readLine()?.toInt() as Int
                                    when (Opcion){
                                        1->{TamañoRAM = "8GB"}
                                        2->{TamañoRAM = "12GB"}
                                        3->{TamañoRAM = "16GB"}
                                    }
                                }
                                2-> {
                                    MemoriaRAM = "DDR2"
                                    print("\nSelecciona el tamaño de la RAM:\n" + "1.- 8GB\n" + "2.- 12GB\n" + "3.- 16GB\n")
                                    Opcion = readLine()?.toInt() as Int
                                    when (Opcion){
                                        1->{TamañoRAM = "8GB"}
                                        2->{TamañoRAM = "12GB"}
                                        3->{TamañoRAM = "16GB"}

                                    }
                                }
                                3-> {
                                    MemoriaRAM = "DDR3"
                                    print("\nSelecciona el tamaño de la RAM:\n" + "1.- 8GB\n" + "2.- 12GB\n" + "3.- 16GB\n")
                                    Opcion = readLine()?.toInt() as Int
                                    when (Opcion){
                                        1->{TamañoRAM = "8GB"}
                                        2->{TamañoRAM = "12GB"}
                                        3->{TamañoRAM = "16GB"}

                                    }
                                }
                            }
                        }
                        3 -> {
                            print("\nSelecciona el tipo de disco duro:\n" + "1.- SSD (solido)\n" + "2.- HDD\n")
                            Opcion = readLine()?.toInt() as Int
                            when (Opcion){
                                1-> {
                                    TipoDD = "SSD"
                                    print("\nSelecciona el tamaño de almacenamiento del DD:\n" + "1.- 1TB\n" + "2.- 2TB\n")
                                    Opcion = readLine()?.toInt() as Int
                                    when (Opcion){
                                        1-> {TamañoDD = "1TB"}
                                        2->{TamañoDD = "2TB" }
                                    }
                                }
                                2-> {
                                    TipoDD = "HDD"
                                    print("\nSelecciona el tamaño de almacenamiento del DD:\n" + "1.- 1TB\n" + "2.- 2TB\n")
                                    Opcion = readLine()?.toInt() as Int
                                    when (Opcion){
                                        1-> {TamañoDD = "1TB"}
                                        2->{TamañoDD = "2TB" }
                                    }
                                }
                            }

                        }

                    }
                } while (Opcion != 4)
            }
            2 -> {
                Ensamble.addAll(listOf("\nTipo de Procesador: " + TipoProc + "\nTipo de memoria RAM: " + MemoriaRAM + " de " + TamañoRAM +
                        "\nTipo de disco duro: " + TipoDD + " con " + TamañoDD + " de almacenamiento\n"))
                println(Ensamble)
            }
        }
    }while (Opcion != 3)
}