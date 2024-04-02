package net.Animales.Animal;

public class Animal {

    private String tipoDeAlimentacion;

    public Animal(String tipoDeAlimentacion){
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }
    public String haceRuido(){
        String mensaje = "Hace ruido";
        System.out.println(mensaje);
        return mensaje;
    }

    public String getTipoDeAlimentacion(){
        return this.tipoDeAlimentacion;
    }

    
    
}
