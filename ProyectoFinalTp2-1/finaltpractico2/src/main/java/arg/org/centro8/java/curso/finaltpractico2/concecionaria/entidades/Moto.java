package arg.org.centro8.java.curso.finaltpractico2.concecionaria.entidades;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter // metodo que permite acceder a los atributos
// declarados como privados.
@EqualsAndHashCode(callSuper = true)
/*
 * Metodo Equals: compara los objetos por medio
 * de su codigo hash.
 * Codigo hash: es un valor entero calculado por
 * java a partir del estado o identidad del objeto.
 * Este valor se utiliza estructuras de datos hash
 * para facilitar la busquedad y almacenamiento
 * eficiente de objetos. No es la direccion de
 * memoria.
 */

public class Moto extends Vehiculo {
	private int cilindrada;

	/*
	 * Atributo privado acceso restringido. Accesible solo
	 * para la clase que lo esta definiendo. Utilizado para declarar
	 * miembros que solo deben ser utlizados para la clase
	 * 
	 */
	public Moto(String marca, String modelo,int cilindrada,double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		DecimalFormatSymbols simbolo = new DecimalFormatSymbols(Locale.GERMANY);
		DecimalFormat df = new DecimalFormat("$#,##0.00", simbolo);
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + cilindrada + "c // Precio: $ "
				+ df.format(getPrecio());
	}

}
