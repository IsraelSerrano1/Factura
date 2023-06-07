package com.softtek.prueba1.modelo;

import org.springframework.stereotype.Component;

@Component("Isr")
public class IvaSuperReducido implements  IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio() * 0.04;
    }
}
