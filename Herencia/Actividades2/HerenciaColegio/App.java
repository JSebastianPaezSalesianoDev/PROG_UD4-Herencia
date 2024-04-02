package HerenciaColegio;

import HerenciaColegio.net.salesianos.personas.Persona;
import HerenciaColegio.net.salesianos.personas.empleados.Empleado;
import HerenciaColegio.net.salesianos.personas.empleados.Profesor;
import HerenciaColegio.net.salesianos.personas.empleados.pas.PersonaLimpieza;

public class App {
    public static void main(String[] args) throws Exception {
        Persona pepesado = new Persona("hola", 23);
        pepesado.setNombreCompleto("Pepe Jiménez Pajuelo");
        System.out.println(pepesado.getNombreCompleto());

        Profesor ticher = new Profesor("1234", "Sekiam", 31);
        ticher.darClases();

        PersonaLimpieza chachi = new PersonaLimpieza("Adrian", 24, "01239");
        chachi.setNombreCompleto("El ticher chachi.");
        chachi.trabajar();
    }
}
