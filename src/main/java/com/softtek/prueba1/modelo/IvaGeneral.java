package com.softtek.prueba1.modelo;

import org.springframework.stereotype.Component;

@Component("Ig")
public class IvaGeneral implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio() * 0.21;
    }
}
