package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String origen;
	private String destino;
	private int duracion;
	private int precioPorSegundo;

	public Llamada(String origen, String destino, int duracion, int precioPorSegundo) {
		this.origen = origen;
		this.precioPorSegundo = precioPorSegundo;
		this.destino = destino;
		this.duracion = duracion;
	}

	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}

	public double getPrecio() {
		return this.duracion * this.precioPorSegundo + (this.duracion * this.precioPorSegundo * 0.21);
	}
}
