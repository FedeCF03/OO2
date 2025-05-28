package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String tipo;
	private String nombre;
	private String numeroTelefono;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	protected double aplicarDescuento(double monto, double descuento) {
		return monto - (monto * descuento);

	}

	public void añadirLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}

	public double calcularMontoTotalLlamadas() {
		return llamadas.stream().mapToDouble(Llamada::getPrecio).sum();

	}
}
