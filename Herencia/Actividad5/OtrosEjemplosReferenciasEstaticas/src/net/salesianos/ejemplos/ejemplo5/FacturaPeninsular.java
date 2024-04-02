package net.salesianos.ejemplos.ejemplo5;

public class FacturaPeninsular extends Factura {
  public FacturaPeninsular(int id, double importe) {
      super(id, importe);
  }

  @Override
  public double calcularTotal() {
      return importe * 1.21;
  }
}