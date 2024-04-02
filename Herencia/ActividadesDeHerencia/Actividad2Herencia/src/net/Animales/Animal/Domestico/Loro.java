package net.Animales.Animal.Domestico;

import net.Animales.Animal.Animal;
import net.Animales.Animal.Granja.AnimalGranja;

public class Loro extends AnimalDomestico {

    private boolean haEscapado = false;

    public Loro(String nombre, String tipoDeAlimentacion) {

        super(nombre, tipoDeAlimentacion);

    }

    public boolean volar(String nombre) {
        if (haEscapado) {
            String mensaje = "cuantas veces quiere que se escape " + nombre;
            System.out.println(mensaje);
        }
        else{

            System.out.println("Tu loro " + nombre + " ha salido volando");
            haEscapado = true;
        }
        return haEscapado;
    }

    @Override
    public String haceRuido() {
        String mensaje = "comacacao!";
        System.out.println(mensaje);
        return mensaje;
    }

    public String toString() {
        String mensaje = "Este perro " + getNombre() + " y se alimenta a base de " + getTipoDeAlimentacion();
        return mensaje;
    }
}
