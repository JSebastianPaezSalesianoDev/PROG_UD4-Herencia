package HerenciaColegio.net.salesianos.personas;

public class Persona {
    private String nombreCompleto;
    private int edad;
    protected String dni;

    public Persona(String name, int edad ){
        this.nombreCompleto=name;
        this.edad=edad;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
}
