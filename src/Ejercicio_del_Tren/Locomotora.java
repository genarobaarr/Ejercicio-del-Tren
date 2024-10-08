package Ejercicio_del_Tren;

public class Locomotora extends ElementoTren{

    public Locomotora() {
        super("Locomotora", 20.17, 92600);
    }

    public double getCapacidadCarga() {
        return 200000;
    }
}
