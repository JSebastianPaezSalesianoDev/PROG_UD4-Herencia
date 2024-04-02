
package net.salesianos.ejemplos.ejemplo5;

public class Factura {
  protected int id;
  protected double importe;

  public Factura(int id, double importe) {
      this.id = id;
      this.importe = importe;
  }

  public double calcularTotal() {
      return importe;
  }
  
}