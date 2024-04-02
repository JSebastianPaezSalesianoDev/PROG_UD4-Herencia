package net.salesianos.actividad2;

public class Barco {

    protected String nombre;
    protected int velocidad;
    protected int altura;
    protected int eslora;
    protected boolean estaAnclado;

    public Barco(String nombre, int altura, int eslora) {
        this.nombre = nombre;
        this.altura = altura;
        this.eslora = eslora;
        this.velocidad = 0;
        this.estaAnclado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public boolean isEstaAnclado() {
        return estaAnclado;
    }

    public void setEstaAnclado(boolean estaAnclado) {
        this.estaAnclado = estaAnclado;
    }

    public void navegar() {
        if (estaAnclado) {
            setEstaAnclado(false);
            setVelocidad(10);
            System.out.println("A la aventura");
        } else {
            System.out.println("Ya está navegando");
        }
    }

    public void anclar() {
        if (!estaAnclado && velocidad <= 10) {
            setVelocidad(0);
            setEstaAnclado(true);
            System.out.println("El barco se ha anclado con exito");
        } else if (velocidad > 10) {
            System.out.println("El barco va demasiado rapido para anclarlo, reduce la velocidad");
        } else {
            System.out.println("El barco ya está anclado");
        }
    }
}