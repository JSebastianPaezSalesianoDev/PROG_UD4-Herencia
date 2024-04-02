package administracioncomunidad.comunidades.facturas;

public class Factura {
    
    protected int id;
    protected int importe;

    public Factura(int id, int importe) {
        this.id = id;
        this.importe = importe;
    }

    public int calcularTotal() {
        return importe;
    }
}
