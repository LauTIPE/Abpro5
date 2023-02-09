package com.unab;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

public class Usuario {

	private String NombreUsuario;
	private String FechaNacimientoUsuario;
	private String RunUsuario;
	private int edad;

	// constructor vacio
	public Usuario() {
	}

	// contructor con atributos como parametros

	public Usuario(String NombreUsuario, String FechaNacimientoUsuario, String RunUsuario, int edad) {
		this.NombreUsuario = NombreUsuario;
		this.FechaNacimientoUsuario = FechaNacimientoUsuario;
		this.RunUsuario = RunUsuario;
		this.edad = edad;
	}

	// Constructor con atributos como parametros
	
	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public String getFechaNacimientoUsuario() {
		return FechaNacimientoUsuario;
	}

	public void setFechaNacimientoUsuario(String fechaNacimientoUsuario) {
		FechaNacimientoUsuario = fechaNacimientoUsuario;
	}

	public String getRunUsuario() {
		return RunUsuario;
	}

	public void setRunUsuario(String runUsuario) {
		RunUsuario = runUsuario;
	}

	
	//Metodo toString
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
				return "USUARIO:" + "\n"+ "Nombre de usuario: " + NombreUsuario  + "\nFecha de Nacimiento: "+ FechaNacimientoUsuario + "\nRun del usuario: "+ RunUsuario +"\nedad del usuario: "+ edad;
	}
	
	//retorna un mensaje que diga "El usuario tiene X años”, en donde X es la edad del usuario en cuestión"
	public String calcularEdad(int año, int mes, int dia) {
	    LocalDate fechaNacimiento;
	    try {
	        fechaNacimiento = LocalDate.of(año, mes, dia);
	    } catch (DateTimeException e) {
	        return "La fecha de nacimiento es inválida.";
	    }
	    LocalDate hoy = LocalDate.now();
	    Period periodo = Period.between(fechaNacimiento, hoy);
	    int años = periodo.getYears();
	    int meses = periodo.getMonths();
	    int días = periodo.getDays();
	    return "El usuario tiene " + años + " años, " + meses + " meses y " + días + " días.";
	}

}