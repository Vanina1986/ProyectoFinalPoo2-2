package arg.org.centro8.java.curso.finaltpractico2.testconcecionaria;

import arg.org.centro8.java.curso.finaltpractico2.concecionaria.implementacion.Concesionaria;

public class TestConcecionaria {
	public static void main(String[] args) {
		Concesionaria concesionaria = new Concesionaria();
		System.out.println();
		System.out.println();
		concesionaria.crearListaVehiculo();
		concesionaria.mostrarListaVehiculo();
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		concesionaria.mostrarVehiculoMasCaro();
		concesionaria.mostrarVehiculoMasBarato();
		concesionaria.mostrarVehiculoQueContieneModeloY();
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Vehículos ordenados por precio de mayor a menor: ");
		concesionaria.mostrarVehiculoOrdenadoDeMayorAmenorPorPrecio();
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Vehculo ordenados por orden natural(marca, modelo, precio):");
		concesionaria.mostrarVehiculoOrdenNatural();
		System.out.println();

	}
}
