public class Main {
    public static void main(String[] args) {

        Bicicleta Jamayra = new Bicicleta("BH Gacela");
        System.out.println(Jamayra);

        Jamayra.acelerar();
        Jamayra.frenar();
        System.out.println(Jamayra.getSpeed());
        if (Jamayra.cambiarPiñon(3)){
            System.out.println("Accion realizada");
        } else System.out.println("No puedes cambiar a un piñon no adyacente");
        if (Jamayra.cambiarPlato(2)){
            System.out.println("Accion realizada");
        } else System.out.println("No puedes cambiar a un plato no adyacente");
        System.out.println(Jamayra);
    }
}
