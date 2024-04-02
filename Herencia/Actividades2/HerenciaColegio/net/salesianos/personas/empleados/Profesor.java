package HerenciaColegio.net.salesianos.personas.empleados;
import HerenciaColegio.net.salesianos.personas.empleados.Empleado;
import HerenciaColegio.net.salesianos.personas.Persona;

public class Profesor extends Empleado {

    public Profesor(String numeroSeguridadSocial ,String name, int edad){
        super(name, edad, numeroSeguridadSocial);
    }
    public void darClases(){
        System.out.println("Callarse porfavor");
    }

    @Override
    public void trabajar(){
        System.out.println("Estoy dando clases...");
    }
    
}
