package net.ikeasalesiano.electrodomesticos;

public class Nevera extends Electrodomestico {

    private float temperatura;

    public Nevera(String marca, String modelo, float peso, float potencia, float temperatura) {
        super(marca, modelo, peso, potencia);
        this.temperatura = temperatura;
    }

    public float getTemperatura() {
        return temperatura;
    }

    @Override
    public boolean EncenderElectrodomestico() {
        System.out.println("-----------------------------------------------\nÑos, que fuerte pelete!");
        return this.estaEncendida = true;   
    }

    @Override
    public String toString() {
        String mensaje = "-----------------------------------------------------------------------------------------------\n";
        mensaje += "*Tipo de electrodomestico: Nevera\n";
        mensaje += "Marca: <" + getMarca() + ">\n";
        mensaje += "Modelo: <" + getModelo() + ">\n";
        mensaje += "Peso: <" + getPeso() + ">\n";
        mensaje += "Potencia: <" + getPotencia() + ">\n";
        mensaje += "Temperatura: <" + getTemperatura() + ">\n";
        mensaje += "Esta encendido: <";
        if (isEstaEncendida()) {
            mensaje += "shi";
        }else
        {
            mensaje += "nyo";
        }
        mensaje+= ">";

        return mensaje;
    }
}
