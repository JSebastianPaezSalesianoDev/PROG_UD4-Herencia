package net.Animales.Animal.Granja;

import net.Animales.Animal.Animal;

public class Gallina extends AnimalGranja {

    private int huevosPuestos;

    public Gallina(String tipoDeAlimentacion) {
        super(tipoDeAlimentacion);
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    @Override
    public String haceRuido() {
        String mensaje = "kikiriki!";
        System.out.println(mensaje);
        return mensaje;
    }

    @Override
    public void producir() {
        System.out.println("HA PRODUCIDO" + huevosPuestos + "webos");
        huevosPuestos++;
    }

    public String toString() {
        String mensaje = "Esta gallina, ha producido  " + getHuevosPuestos() + "huevos";
        return mensaje;
    }

}