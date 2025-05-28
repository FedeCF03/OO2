package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private GeneradorStrategy tipoGenerador;

	public boolean añadirNumero(String str) {
		if (lineas.contains(str)) {
			lineas.add(str);
			return true;
		}
		return false;
	}

	public String obtenerNumeroLibre() {
			tipoGenerador
	}

	public void cambiarTipoGenerador(String valor) {
		this.tipoGenerador = valor;
	}
}
