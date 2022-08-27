package com.ciclo3.sprint2_Global_line;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class Sprint2GlobalLineApplication {

	public static void main(String[] args) {

		//SpringApplication.run(Sprint2GlobalLineApplication.class, args);

		Servicio servi1 = new Servicio(true, "Pantalla Oscura sin respuesta","Reemplazar Display", "Ab 01");
		Servicio servi2 = new Servicio(true, "Sin auido en parlantes","reemplazar vocina", "Ab 02");

		Tecnico tecnico1 = new Tecnico("Luis", 2323, "display", servi1 );

		Tecnico tecnico2 = new Tecnico("Ernesto", 5689, "sistema audio", servi2);

		Cliente cliente1 = new Cliente("Juan", 456589765, "Redmi 11", 315648764,
				"Pantalla oscura no funciona", tecnico1);

		Cliente cliente2 = new Cliente("Andres", 58976589, "Iphone 8", 318645564,
				"Sin salida de sonido", tecnico2);

		List<Cliente> ListaClientes = new ArrayList<>();
		List<Tecnico> ListaTecnicos = new ArrayList<>();
		List<Servicio> ListaServicios = new ArrayList<>();


		ListaClientes.add(cliente1);
		ListaClientes.add(cliente2);

		ListaTecnicos.add(tecnico1);
		ListaTecnicos.add(tecnico2);

		ListaServicios.add(servi1);
		ListaServicios.add(servi2);



		System.out.println("Cliente");

		for (int i = 0; i < ListaClientes.size(); i++){

			System.out.println(ListaClientes.get(i).toString());
		}
		System.out.println("Tecnicos");

		for (int i = 0; i < ListaTecnicos.size(); i++){

			System.out.println(ListaTecnicos.get(i).toString());
		}
		System.out.println("Servicios");

		for (int i = 0; i < ListaServicios.size(); i++){

			System.out.println(ListaServicios.get(i).toString());

		}




	}

}
