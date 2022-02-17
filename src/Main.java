public class Main {
    public static void main(String[] args) {

        Bicicleta Jamayra = new Bicicleta("BH Gacela");
        System.out.println(Jamayra);

        Jamayra.acelerar();
        Jamayra.acelerar();
        Jamayra.acelerar();
        Jamayra.acelerar();
        Jamayra.acelerar();
        Jamayra.acelerar();
        Jamayra.acelerar();
        Jamayra.acelerar();
        Jamayra.acelerar();
        System.out.println(Jamayra.getSpeed());
        if (Jamayra.cambiarPiñon(3)){
            System.out.println("Accion realizada");
        } else System.out.println("No puedes cambiar a un piñon no adyacente o mayor al numero de piñones");
        if (Jamayra.cambiarPlato(2)){
            System.out.println("Accion realizada");
        } else System.out.println("No puedes cambiar a un plato no adyacente o mayor al numero de platos");
        if (Jamayra.cambiarPlato(3)){
            System.out.println("Accion realizada");
        } else System.out.println("No puedes cambiar a un plato no adyacente o mayor al numero de platos");
        if (Jamayra.cambiarPlato(4)){
            System.out.println("Accion realizada");
        } else System.out.println("No puedes cambiar a un plato no adyacente o mayor al numero de platos");
        System.out.println(Jamayra);
    }
}
