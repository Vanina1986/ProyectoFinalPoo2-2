package arg.org.centro8.java.curso.finaltpractico2.concecionaria.interfaces;

public interface IConcesionariaVehiculo {
	/*
	 * Una interfaz no tiene constructores, no se
	 * puede instanciar. Puede declarar metodos
	 * abstractos(no tienen cuerpo o comportamiento la clase que la hereden
	 * debe implementar los metodos abstractos).
	 */

	public abstract void crearListaVehiculo();

	public abstract void mostrarListaVehiculo();

	public abstract void mostrarVehiculoMasCaro();

	public abstract void mostrarVehiculoMasBarato();

	public abstract void mostrarVehiculoQueContieneModeloY();

	public abstract void mostrarVehiculoOrdenadoDeMayorAmenorPorPrecio();

	public abstract void mostrarVehiculoOrdenNatural();
}
