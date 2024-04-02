package net.Animales.Animal.Domestico;

import net.Animales.Animal.Animal;

public class Gato extends AnimalDomestico{

    public Gato(String nombre,String tipoDeAlimentacion){
        
        super(nombre,tipoDeAlimentacion);
        
    }


     @Override
    public String haceRuido() {
        String mensaje = "miau!";
        System.out.println(mensaje);
        return mensaje;
    }

    @Override
    public String toString() {
        String mensaje = "Este gato " + getNombre() + " y se alimenta a base de " + getTipoDeAlimentacion();
        return mensaje;
    }
    
    
}
