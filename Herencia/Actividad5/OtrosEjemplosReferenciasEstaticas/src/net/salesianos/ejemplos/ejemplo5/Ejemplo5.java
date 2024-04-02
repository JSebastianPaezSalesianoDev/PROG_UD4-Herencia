package net.salesianos.ejemplos.ejemplo5;

public class Ejemplo5 {
  public static void main(String[] args) {
    FacturaCanaria IGIC = new FacturaCanaria(123456, 24.19);
    System.out.println("El precio en Canarias se te queda en : " + IGIC.calcularTotal() + " €.");

    FacturaPeninsular IVA = new FacturaPeninsular(456789, 16.19);
    System.out.println("El precio en la Península se te queda en: " + IVA.calcularTotal() + " €.");
  }
}