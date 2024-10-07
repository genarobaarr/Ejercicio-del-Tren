package Ejercicio_del_Tren;

public class Vagon {

    private String tipo;
    private double carga;
    private double peso;
    private double longitud;

    public Vagon(String tipo, double longitud, double peso) {
        this.tipo = tipo;
        this.longitud = longitud;
        this.peso = peso;
        this.carga = peso - 25400;

        new ElementoTren(tipo, longitud, peso);
    }
}
