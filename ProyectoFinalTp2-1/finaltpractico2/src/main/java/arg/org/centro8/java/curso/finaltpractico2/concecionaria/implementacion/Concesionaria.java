package arg.org.centro8.java.curso.finaltpractico2.concecionaria.implementacion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import arg.org.centro8.java.curso.finaltpractico2.concecionaria.entidades.Auto;
import arg.org.centro8.java.curso.finaltpractico2.concecionaria.entidades.Moto;
import arg.org.centro8.java.curso.finaltpractico2.concecionaria.entidades.Vehiculo;
import arg.org.centro8.java.curso.finaltpractico2.concecionaria.interfaces.IConcesionariaVehiculo;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
/*
 * @NoArgsConstructor:
 * anotacion de lombok genera automaticamente
 * un constructor sin parametro(constructor
 * vacio) para la clase en tiempo de compilacion.
 * Permite crear la instancia, ejemplo en este
 * trabajo practico: en el TestConcesionaria
 * Concesionaria concesionaria=new Concesionaria;
 * y luego llamar concesionaria.crearListaVehiculo();
 */
public class Concesionaria implements IConcesionariaVehiculo {
	private List<Vehiculo> vehiculos = new ArrayList<>();

	@Override
	public void crearListaVehiculo() {
		vehiculos.add(new Auto("Peugeot", "206", 4, 200000));
		vehiculos.add(new Moto("Honda", "Titan", 125, 60000));
		vehiculos.add(new Auto("Peugeot", "208", 5, 250000));
		vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));
	}

	@Override
	public void mostrarListaVehiculo() {
		vehiculos.forEach(System.out::println);
		/*
		 * se modifico y este metodo muestra la lista
		 * creada en el metodo crearListaVehiculo.
		 * Para poder mostrar la lista creada se utliza:
		 * vehiculos.forEach(System.out::println);
		 * forEach()interfaz Iterable toma accion y ejecuta.
		 * :: apunta a println.
		 */

	}

	@Override
	public void mostrarVehiculoMasBarato() {

		vehiculos
				.stream()// devuelve la secuencia de elementos para procesarlos
				.min(Comparator.comparingDouble(Vehiculo::getPrecio))
				// min(minimo) devuelve un objeto optional
				.ifPresent(v -> System.out.printf("Vehículo más barato: %s %s%n", v.getMarca(),
						v.getModelo()));

		/*
		 * ifPresent imprime si el resultado existe
		 * v(predicado:funcion o expresion.
		 * -> se implementa una expresion lambda(recibe un parametro y devolvera un
		 * boolean)
		 * si existe dentro de la lista vehiculos debera imprimir la marca
		 * y modelo.
		 */

	}

	@Override
	public void mostrarVehiculoMasCaro() {
		vehiculos
				.stream()// devuelve la secuencia de elementos para procesarlos
				.max(Comparator.comparingDouble
				// comparingDouble trabaja la comparación de
				// números reales o decimales
				(Vehiculo::getPrecio))
				// max devuelve el maximo
				.ifPresent(v -> System.out.printf("Vehículo más caro: %s %s%n", v.getMarca(),
						v.getModelo()));

	}

	@Override
	public void mostrarVehiculoOrdenNatural() {

		/*
		 * El ordenamiento natural: orden de clasificacion que se aplica al
		 * objeto el orden lexico(regla o metodo para organizar elementos
		 * palabras, letras o secuencia de datos) para una cadena, orden
		 * numerico para ordenar enteros,orden alfabetico, etc.
		 */

		vehiculos
				.stream()// devuelve una secuencia de elementos
				// para procesarlo, pero no gaurda elementos
				.sorted()
				.forEach(System.out::println);
		// esto permite mostrar el resultado

	}

	@Override
	public void mostrarVehiculoOrdenadoDeMayorAmenorPorPrecio() {

		vehiculos
				.stream()
				.sorted(Comparator.comparingDouble(Vehiculo::getPrecio)
						.reversed())
				.forEach(v -> System.out.printf("%s %s%n", v.getMarca(), v.getModelo()));
		/*
		 * System.out.printf
		 * se utiliza para imprimir directamente con formato
		 * %s marcador de posicion para un valor de
		 * de tipo String se reemplaza por el primer
		 * argumento
		 * %s el segundo es otro maracdor de tipo string
		 * que se reemplaza por el segundo argumento
		 * %n es un salto de linea
		 */

	}

	@Override
	public void mostrarVehiculoQueContieneModeloY() {

		/*
		 * metodo mostrarVehiculoQueContieneModeloY:
		 * este metodo mostrara que contiene el modelo
		 * letra y
		 * sorted: devuelve un stream con los elementos
		 * ordenados. Al no tener Argumentos ordena los
		 * elemntos por orden natural.
		 * System.out.prinf mostrara el texto formatedo
		 */
		vehiculos.stream()
				.filter(v -> v.getModelo().toLowerCase().contains("y"))
				.sorted()
				.forEach(v -> System.out.printf(
						"Vehículo que contiene en el modelo la letra 'Y': %s %s $%,.2f%n",
						v.getMarca(), v.getModelo(), v.getPrecio()));
	}

}
