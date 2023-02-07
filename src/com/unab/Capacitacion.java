/**
 * 
 */
package com.unab;

/**
 * @author vespertino
 *
 */

//Creacion de la clase con la declaración de sus atributos
public class Capacitacion {
	private int identificador;
	private String RUTCliente;
	private String dia;
	private String hora;
	private String lugar;
	private int duracion;
	private int cantidadAsistentes;

	// Constructor sin parámetros
	public Capacitacion() {
	}

	// Constructor con todos los atributos como parámetros
	public Capacitacion(int identificador, String RUTCliente, String dia, String hora, String lugar, int duracion, int cantidadAsistentes) {
		this.identificador = identificador;
		this.RUTCliente = RUTCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	// Getters and Setters
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getRUTCliente() {
		return RUTCliente;
	}

	public void setRUTCliente(String rUTCliente) {
		RUTCliente = rUTCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	// Método toString
	@Override
	public String toString() {
		return "CAPACITACIÓN: " + "\n" +
				"identificador:" + identificador + "\n" + 
				"RUTCliente: " + RUTCliente + "\n" +
				"dia: " + dia + "\n" +
				"hora: " + hora + "\n" +
				"lugar: " + lugar + "\n" + 
				"duracion: " + duracion + "\n"  + 
				"cantidadAsistentes: " + cantidadAsistentes;
	}

}