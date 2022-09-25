package com.Sprint2.GlobalLineSa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class GlobalLineSaApplication {

	public static void main(String[] args) {

		SpringApplication.run(GlobalLineSaApplication.class, args);

		/*

		Dinero dinero1 = new Dinero(1010, "arreglo de pantalla", 251000, "Santos S.A", "Santos");
		Dinero dinero2 = new Dinero(2020, "limpieza general", 120000, "Bodegas S.A", "Bodegas");


		Empleado empleado1 = new Empleado(1010, "marco@global.com", "Marco", "Tecnico Pantallas", "Global",
				"qw123", dinero1);

		Empleado empleado2 = new Empleado(2020, "luis@global.com", "Luis", "Tecnico Limpieza", "Global",
				"qw365", dinero2);

		Empresa empresa1 = new Empresa(12356, "Santos S.A", "11223355", "3184565252", "Cra 1 # 2-5",
				"Santos", empleado1);

		Empresa empresa2 = new Empresa(56555, "Bodegas S.A", "45578899", "3154789652", "Cra 61 # 22-65",
				"Bodegas", empleado2);

		List<Empresa> listaEmpresas = new ArrayList<>();
		List<Empleado> listaEmpleados = new ArrayList<>();
		List<Dinero> listaDineros = new ArrayList<>();


		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);

		listaEmpleados.add(empleado1);
		listaEmpleados.add(empleado2);

		listaDineros.add(dinero1);
		listaDineros.add(dinero2);



		System.out.println("Empresas");

		for (int i = 0; i < listaEmpresas.size(); i++) {

			System.out.println(listaEmpresas.get(i).toString());

		}


		System.out.println("Empleados");

		for (int i = 0; i < listaEmpleados.size(); i++) {

			System.out.println(listaEmpleados.get(i).toString());
		}

		System.out.println("Dineros");

		for (int i = 0; i < listaDineros.size(); i++) {

			System.out.println(listaDineros.get(i).toString());
		}

		 */


	}

}
