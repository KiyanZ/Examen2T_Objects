public class Bicicleta {

    //Im thinking that the bicycle is statinoary at first then u can use get to check the values after using methods to change them;

    private String modelo;

    //Define model on constructor once;
    // en model no hace falta el set ya que una bicileta no se puede cambiar de modelo asi porque si;
    // get para ver el valor;
    public String getModelo() {
        return "Modelo: " + modelo;
    }

    //en speed he puesto solo get ya que los cambios de velocidad los realizaremos con los metodos.
    private double Speed;

    public double getSpeed() {
        return Speed;
    }

    private int plato;

    //en plato he puesto solo get ya que cambiaremos las posiciones con los metodos mas adelante.
    public int getPlato() {
        return plato;
    }

    private int piñon;

    //en piñoñ he puesto solo get ya que cambiaremos las posiciones con los metodos mas adelante.
    public int getPiñon() {
        return piñon;
    }
    //Definimos el modelo ya que es algo definible;
    // Los valores speed, plato y piñon en minimo ya que empezaremos con la bicileta estacionada
    // no hace falta definir estos valores al hacer la bici;
    public Bicicleta(String model) {
        this.modelo = model;
        Speed = 0;
        plato = 1;
        piñon = 1;
    }

    public void acelerar() {
        Speed = Speed + 5;
    }

    public void frenar() {
        Speed = Speed / 2;
    }

    public void parar() {
        Speed = 0;
    }

    public boolean cambiarPlato(int changeplato) {
        if (changeplato != (plato - 1 | plato + 1)) {
            return false;
        }
        plato = changeplato;
        return true;
    }

    public boolean cambiarPiñon(int changepiñon) {
        if (changepiñon != (piñon - 1 | piñon + 1)) {
            return false;
        }
        plato = changepiñon;
        return true;
    }

    @Override
    public String toString() {
        return "Bicicleta:" + modelo + ", Velocidad:" + Speed + " km/h" + ", Plato:" + plato + ", Piñon:" + piñon;
    }
}
