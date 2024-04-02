package net.Animales.Animal.Domestico;

import net.Animales.Animal.Animal;

public class AnimalDomestico extends Animal {
    
    private String nombre;

    public AnimalDomestico(String nombre, String tipoDeAlimentacion){
        super(tipoDeAlimentacion);
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    

    
}
