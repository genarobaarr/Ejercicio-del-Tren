package Ejercicio_del_Tren;

import java.util.Arrays;

public class Tren {

    private double capacidadCarga = 0;
    private ElementoTren[] elementos = new ElementoTren[100];
    private double longitud = 0;
    private int numElementos = 0;
    private double peso = 0;
    private int tamActual = 0;

    public Tren() {
    }

    public void agregarLocomotora(Locomotora locomotora) {
        if (tamActual < 100) {
            capacidadCarga += locomotora.getCapacidadCarga();
            longitud += locomotora.getLongitud();
            numElementos++;
            peso += locomotora.getPeso();
            elementos[tamActual] = locomotora;
            tamActual++;
        }
    }

    public void agregarVagon(Vagon vagon) {
        if (tamActual < 100) {
            while (peso + vagon.getPeso() > capacidadCarga) {
                agregarLocomotora(new Locomotora());
            }
            longitud += vagon.getLongitud();
            numElementos++;
            peso += vagon.getPeso();
            elementos[tamActual] = vagon;
            tamActual++;
        }
    }

    private void ajustarDimensiones(ElementoTren elementos) {

    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void getInfo() {

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
        StringBuilder trenCompleto = new StringBuilder();
        for (ElementoTren elemento : elementos) {
            if (elemento != null) {
                trenCompleto.append("|").append(elemento.getTipo()).append("|¬");
            }
        }

        return  "\n--- Dimensiones ---\n" +
                "Número de Elementos = " + numElementos +
                "\nPeso = " + peso + " kilogramos" +
                "\nLongitud = " + longitud + " metros" +
                "\nCapacidad de Carga = " + capacidadCarga + " kilogramos" +
                "\n\n" + trenCompleto.toString();
    }
}
