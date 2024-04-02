package net.salesianos.ejemplos.ejemplo5;

public class FacturaCanaria extends Factura {
  public FacturaCanaria(int id, double importe) {
      super(id, importe);
  }

  @Override
  public double calcularTotal() {
      return importe * 1.07;
  }
}
