package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	public boolean agregarNumeroTelefono(String str) {
		return guia.añadirNumero(str);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public Cliente registrarUsuario(Cliente cliente) {
		Cliente var = cliente;
		String tel = guia.obtenerNumeroLibre();
		var.setNumeroTelefono(tel);
		clientes.add(var);
		return var;
	}

	public Llamada registrarLlamada(Cliente origen, Cliente destino, String t, int duracion, Llamada llamada) {
		llamadas.add(llamada);
		origen.añadirLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalAPagar(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();

	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
