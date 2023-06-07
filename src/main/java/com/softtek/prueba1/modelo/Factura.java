package com.softtek.prueba1.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Factura {
    @Autowired
    @Qualifier("Ig")
    private IImpuesto impuesto;
    private List<Producto> productos;

public double calcularTotalFactura(Producto p1){


    return p1.getPrecio() + impuesto.calcularImpuesto(p1);
}
}
