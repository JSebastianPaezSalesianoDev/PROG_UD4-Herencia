package net.editorialsalesiana.gestion.impuestos.peninsulares;

import net.editorialsalesiana.libreria.Publicacion;

public class ImpuestoPeninsula extends Publicacion {

    public ImpuestoPeninsula(float precioPublico) {
        super(precioPublico);
    }

    public static float sacarIva(float precioPublico) {
        return precioPublico * 1.21f;
    }
}
