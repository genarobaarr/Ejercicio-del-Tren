package Ejercicio_del_Tren;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Tren tren = new Tren();
        Scanner leer = new Scanner(System.in);
        int opc;
        double carga;

        System.out.print("\n\tSe ha agregado una locomotra para que comience con el programa." +
            "\n\t\t<<<<< TREN >>>>>\n");
        tren.agregarLocomotora(new Locomotora());

        do{
            System.out.print("\t1. Insertar vagón\n" +
                "\t2. Insertar locomotora\n" +
                "\t3. Ver especificación del último elemento\n" +
                "\t4. Ver dimensiones y tren completo\n" +
                "\t5. Salir\n>");
            opc = leer.nextInt();
            System.out.println("\n");

            switch (opc) {
                case 1:
                    System.out.print("\t<<<Agregando vagón>>>\n" +
                            "Ingresa la capacidad de carga del vagón:");
                    carga = leer.nextDouble();
                    tren.agregarVagon(new Vagon(carga));
                    System.out.println("Vagón agregado.\n");
                    break;

                case 2:
                    System.out.print("\t<<<Agregando locomotora>>>\n");
                    tren.agregarLocomotora(new Locomotora());
                    System.out.println("Locomotora agregada.\n");
                    break;

                case 3:
                    System.out.println(tren.informacion);
                    break;

                case 4:
                    System.out.println(tren);
                    break;

                case 5:
                    System.out.println("\tSaliendo del programa.\n");
                    System.out.println(tren);
                    break;
            }

        }while (opc != 5);
    }

}
