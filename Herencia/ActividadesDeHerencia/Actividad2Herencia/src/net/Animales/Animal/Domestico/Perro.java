package net.Animales.Animal.Domestico;

import net.Animales.Animal.Animal;

public class Perro extends AnimalDomestico{



    public Perro(String nombre,String tipoDeAlimentacion){
        
        super(nombre ,tipoDeAlimentacion);
        
    }

     @Override
    public String haceRuido() {
        String mensaje = "wawawa!";
        System.out.println(mensaje);
        return mensaje;
    }
    
    public String toString() {
        String mensaje = "Este perro " + getNombre() + " y se alimenta a base de " + getTipoDeAlimentacion();
        return mensaje;
    }
    
}
