package Ejercicio_del_Tren;

import java.util.Arrays;

public class Tren {

    private double capacidadCarga = 0;
    private ElementoTren elementos[];
    private double longitud = 0;
    private int numElementos = 0;
    private double peso = 0;
    private int tamActual = 0;

    public Tren() {
    }

    public void agregarLocomotora() {
        if (numElementos <= 100) {
            Locomotora locomotora = new Locomotora("Locomotora", 20.17, 92600);
            capacidadCarga += 200000;
            longitud += 20.17;
            numElementos++;
            peso += 92600;
        }
    }

    public void agregarVagones(double carga) {
        if (numElementos <= 100) {
            if (peso < capacidadCarga) {

                Vagon vagon = new Vagon("Vagón", 18.28, 25400 + carga);
                longitud += 18.28;
                numElementos++;
                peso += carga+25400;

            } else {
                agregarLocomotora();
            }
        }
    }

    private void ajustaDimensiones() {

    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void getInfo() {
        toString();
    }

    public double getLongitud() {
        return longitud;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public double getPeso() {
        return peso;
    }

    public int getTamActual() {
        return tamActual;
    }

    @Override
    public String toString() {
        return  "--- Dimensiones ---\n" +
                "Número de Elementos = " + numElementos +
                "\nPeso = " + peso +
                "\nLongitud = " + longitud +
                "\nCapacidad de Carga = " + capacidadCarga;
    }
}
