package net.editorialsalesiana.gestion.impuestos.insulares;

import net.editorialsalesiana.libreria.Publicacion;

public class ImpuestoCanario extends Publicacion {

    public ImpuestoCanario(float precioPublico) {
        super(precioPublico);
    }

    public static float sacarIgic(float precioPublico) {
        return precioPublico * 1.07f;
    }
}
