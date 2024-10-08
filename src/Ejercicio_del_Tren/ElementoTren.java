package Ejercicio_del_Tren;

public class ElementoTren{

    private String tipo;
    private double longitud;
    private double peso;

    public ElementoTren() {
    }

    public ElementoTren(String tipo, double longitud, double peso) {
        this.longitud = longitud;
        this.peso = peso;
        this.tipo = tipo;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ElementoTren{" +
                "longitud=" + longitud +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
