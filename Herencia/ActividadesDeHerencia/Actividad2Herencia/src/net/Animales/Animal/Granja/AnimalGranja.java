package net.Animales.Animal.Granja;

import net.Animales.Animal.Animal;

public class AnimalGranja extends Animal{
    
    public AnimalGranja(String tipoDeAlimentacion){
        super(tipoDeAlimentacion);
    }
    
    public void producir(){
        System.out.println("Un animal ha producido");
    }


} 
