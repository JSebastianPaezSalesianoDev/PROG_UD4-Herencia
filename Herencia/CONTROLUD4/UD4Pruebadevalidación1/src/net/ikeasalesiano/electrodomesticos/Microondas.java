package net.ikeasalesiano.electrodomesticos;

public class Microondas extends Electrodomestico {

    private boolean puertaAbierta;

    public Microondas(String marca, String modelo, float peso, float potencia, boolean puertaAbierta) {
        super(marca, modelo, peso, potencia);
        this.puertaAbierta = puertaAbierta;
    }

    public boolean cerrarPuerta(){
        return puertaAbierta = false;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }
    @Override
    public boolean EncenderElectrodomestico() {
        System.out.println("-----------------------------------------------\n" + 
                        "Algo huele a quemado");
        return this.estaEncendida = true;
    }

    @Override
    public String toString() {
        String mensaje = "-----------------------------------------------------------------------------------------------\n";
        mensaje += "*Tipo de electrodomestico: Microondas\n";
        mensaje += "Marca: <" + getMarca() + ">\n";
        mensaje += "Modelo: <" + getModelo() + ">\n";
        mensaje += "Peso: <" + getPeso() + ">\n";
        mensaje += "Potencia: <" + getPotencia() + ">\n";
        mensaje += "Puerta: <";
        if (isEstaEncendida() || isPuertaAbierta()) {
            mensaje += "cerrada>\n";
        } else {
            mensaje += "abierta>\n";
        }
        mensaje += "Esta encendido: <";
        if (isEstaEncendida()) {
            mensaje += "shi";
        } else {
            mensaje += "nyo";
        }
        mensaje += ">";

        return mensaje;
    }

    
}
