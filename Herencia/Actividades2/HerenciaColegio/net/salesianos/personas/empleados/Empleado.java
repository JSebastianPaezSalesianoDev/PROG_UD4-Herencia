package HerenciaColegio.net.salesianos.personas.empleados;

import HerenciaColegio.net.salesianos.personas.Persona;

public class Empleado extends Persona {

    protected String numeroDeSeguridadSocial;

    public Empleado(String nombre, int edad, String numeroSeguridadSocial){
        super(nombre, edad);
        this.numeroDeSeguridadSocial =numeroSeguridadSocial;

    }
    protected void trabajar(){
        System.out.println("Trabajando...");
    }
   
}
