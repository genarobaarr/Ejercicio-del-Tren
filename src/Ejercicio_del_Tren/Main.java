package Ejercicio_del_Tren;

public class Main {

    public static void main(String[] args) {

        Tren tren = new Tren();
        tren.agregarLocomotora(new Locomotora());
        tren.agregarVagon(new Vagon(80000));
        tren.agregarVagon(new Vagon(120000));
        tren.agregarVagon(new Vagon(70000));
        tren.agregarVagon(new Vagon(280000));
        tren.agregarVagon(new Vagon(35000));
        System.out.println(tren);
    }

}
