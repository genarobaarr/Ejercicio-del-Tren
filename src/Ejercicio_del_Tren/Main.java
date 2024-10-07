package Ejercicio_del_Tren;

public class Main {

    public static void main(String[] args) {

        Tren tren = new Tren();
        tren.agregarLocomotora();
        tren.agregarVagones(80000);
        tren.agregarVagones(120000);
        tren.agregarVagones(70000);
        tren.agregarVagones(280000);
        tren.agregarVagones(35000);
        System.out.println(tren);
        tren.getInfo();
    }

}
