package arg.org.centro8.java.curso.finaltpractico2.concecionaria.entidades;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public abstract class Vehiculo implements Comparable<Vehiculo> {
	/*
	 * Clase abstracta no se puede crear objetos,
	 * se utiliza el abstract para favorecer
	 * la herencia.
	 * Se implemento la interfaz Compable en la clase Abstracta
	 * Vehiculo.
	 */
	private String marca;
	private String modelo;
	private double precio;

	@Override
	public int compareTo(Vehiculo vehiculo) {
		/*
		 * compareTo es un metodo que define
		 * el orden natural(orden de clasificacion
		 * que se aplica al objeto)un ejemplo seria
		 * el orden numerico para ordenar enteros.
		 * Se compara el String se utiliza compareTo de
		 * la clase String para comparar ambas representaciones.
		 */
		String esteVehiculo = this.marca + "," + this.modelo + "," + this.precio;
		String otroVehiculo = vehiculo.marca + "," + vehiculo.modelo + "," + vehiculo.precio;
		return esteVehiculo.compareTo(otroVehiculo);
	}

	/*
	 * se cambio y se declaro el metodo ToString
	 * como abstracto para que las clases hijas
	 * lo implementan.
	 */
	public abstract String toString();

}
