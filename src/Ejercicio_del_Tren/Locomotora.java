package Ejercicio_del_Tren;

public class Locomotora {

    private String tipo;
    private double peso;
    private double longitud;
    private double capacidadCarga = 200000;

    public Locomotora(String tipo, double longitud, double peso) {
        this.tipo = tipo;
        this.longitud = longitud;
        this.peso = peso;

        new ElementoTren(tipo, longitud, peso);
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}
