package net.barcos;

public class Barco {
    
    protected String nombre;
    protected int eslora;
    protected float altura;
    protected float velocidad;
    protected boolean estaAnclado;
    
    public Barco( String nombre, int eslora, float altura ){
        
        this.nombre = nombre;
        this.eslora = eslora;
        this.altura = altura;
        this.velocidad = 0f;
        this.estaAnclado = true;
    }

    public void  navegar(){
        if (estaAnclado) {
            estaAnclado = false;
            velocidad = 10f;
        }else{
            System.out.println("El barco ya esta navegando");
        }
    }

    public void anclar(){

        if (estaAnclado = true) {
            System.out.println("El barco ya esta anclado");
        }else if (velocidad > 10f) {
            System.out.println("La velocidad es demasiada, no podemos anclar");
            estaAnclado = false;
        }else if (velocidad< 10f) {
            estaAnclado = true;
            velocidad = 0f;
        }
        
      
    }
}
