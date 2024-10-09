package Ejercicio_del_Tren;

import java.util.Arrays;

public class Tren {

    private double capacidadCarga = 0;
    private ElementoTren[] elementos = new ElementoTren[100];
    private double longitud = 0;
    private int numElementos = 0;
    private double peso = 0;
    private int tamActual = 0;
    public String informacion;
    private boolean contadorExceso = true;

    public Tren() {
    }

    public void agregarLocomotora(Locomotora locomotora) {
        if (tamActual < 100) {

            elementos[tamActual] = locomotora;
            ajustarDimensiones(locomotora);
            informacion = getInfo(locomotora);

        }else {
            if(contadorExceso) {
                System.out.println("\t\nHas llegado al máximo número de vagones posibles.");
                contadorExceso = false;
            }
        }
    }

    public void agregarVagon(Vagon vagon) {
        if (tamActual < 100) {

            while (peso + vagon.getPeso() > capacidadCarga) {
                agregarLocomotora(new Locomotora());
            }

            elementos[tamActual] = vagon;
            ajustarDimensiones(vagon);
            informacion = getInfo(vagon);

        }else {
            if (contadorExceso) {
                System.out.println("\t\nHas llegado al máximo número de vagones posibles.");
                contadorExceso = false;
            }
        }
    }

    private void ajustarDimensiones(ElementoTren elemento) {

        longitud += elemento.getLongitud();
        numElementos++;
        peso += elemento.getPeso();

        if (elemento.getTipo().equals("Locomotora")){
            Locomotora l = (Locomotora) elemento;
            capacidadCarga += l.getCapacidadCarga();
        }

        tamActual++;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getInfo(ElementoTren elemento) {
        return "\n\t<<<Último vagón>>>\n" +
                "\nTipo = " + elemento.getTipo() +
                "\nPeso = " + elemento.getPeso() + " kilogramos" +
                "\nLongitud = " + elemento.getLongitud() + " metros\n";
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

        return  "\n\t<<<<< DIMENSIONES >>>>>\n" +
                "Número de Elementos = " + numElementos +
                "\nPeso = " + peso + " kilogramos" +
                "\nLongitud = " + longitud + " metros" +
                "\nCapacidad de Carga = " + capacidadCarga + " kilogramos" +
                "\n\n" + trenCompleto.toString() + "\n\n\n";
    }
}
