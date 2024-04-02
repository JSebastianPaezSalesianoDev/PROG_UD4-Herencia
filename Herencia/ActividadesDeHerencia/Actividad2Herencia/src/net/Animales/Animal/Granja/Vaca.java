package net.Animales.Animal.Granja;

import net.Animales.Animal.Animal;

public class Vaca extends AnimalGranja {

    private int lecheProducida;

    public Vaca(String tipoDeAlimentacion) {
        super(tipoDeAlimentacion);
    }

    public int getLecheProducida() {
        return lecheProducida;
    }

    @Override
    public String haceRuido() {
        String mensaje = "muuu!";
        System.out.println(mensaje);
        return mensaje;
    }

    @Override
    public void producir() {
        System.out.println("HA PRODUCIDO leche");
        lecheProducida++;
    }

    public String toString() {
        String mensaje = "Esta vaca, ha producido  " + getLecheProducida() + " leche";
        return mensaje;
    }

}
