package net.ikeasalesiano.electrodomesticos;

public class Electrodomestico {

    protected String marca;
    protected String modelo;
    protected float peso;
    protected float potencia;
    protected boolean estaEncendida;

    public Electrodomestico(String marca, String modelo, float peso, float potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.potencia = potencia;
        this.estaEncendida = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public boolean isEstaEncendida() {
        return estaEncendida;
    }

    public void setEstaEncendida(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }

    public boolean apagarElectrodomestico() {
        return this.estaEncendida = false;
    }

    public boolean EncenderElectrodomestico() {
        return this.estaEncendida = true;
    }
}
