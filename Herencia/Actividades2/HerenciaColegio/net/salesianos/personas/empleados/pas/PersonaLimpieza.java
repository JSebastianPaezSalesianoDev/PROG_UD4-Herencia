package HerenciaColegio.net.salesianos.personas.empleados.pas;

import HerenciaColegio.net.salesianos.personas.Persona;
import HerenciaColegio.net.salesianos.personas.empleados.Empleado;

public class PersonaLimpieza extends Empleado{
    
    public PersonaLimpieza(String nombre, int edad, String numeroDeSeguridadSocial){
        super(nombre, edad, numeroDeSeguridadSocial);
    }
    public void limpiar(){
        System.out.println("Esta trapeado no pasar");
    }

    @Override
    public void trabajar(){
        System.out.println(this.getNombreCompleto() + "va a empezar a trabajar");
        this.limpiar();
    }
}
