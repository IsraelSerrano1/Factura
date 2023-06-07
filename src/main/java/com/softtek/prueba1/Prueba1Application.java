package com.softtek.prueba1;

import com.softtek.prueba1.modelo.Factura;
import com.softtek.prueba1.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Prueba1Application implements CommandLineRunner {
	@Autowired
	Factura factura;

	public static void main(String[] args) {
		SpringApplication.run(Prueba1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	Producto p1 = new Producto("Calamares", 12.5);
		System.out.println("El total de la factura es: " + factura.calcularTotalFactura(p1));

	}
}
