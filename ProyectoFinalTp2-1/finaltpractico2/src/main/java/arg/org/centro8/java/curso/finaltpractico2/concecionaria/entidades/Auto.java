package arg.org.centro8.java.curso.finaltpractico2.concecionaria.entidades;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
@Getter
public class Auto extends Vehiculo {
	/*
	 * La palabra reservada extends indica
	 * que la clase extiende o hereda de otra
	 * clase. Esta clase Auto hereda de la
	 * clase padre Vehiculo.
	 */
	private int puertas;

	// construtor
	public Auto(String marca, String modelo,int puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		DecimalFormatSymbols simbolo = new DecimalFormatSymbols(Locale.GERMANY);
		/*
		 * Locale.GERMANY configura punto para miles
		 * y coma para decimales
		 */
		DecimalFormat df = new DecimalFormat("#,##0.00", simbolo);
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + puertas
				+ " // Precio: $ " + df.format(getPrecio());
	}

}
