package com.unab;

public class Usuario {

	private String NombreUsuario;
	private String FechaNacimientoUsuario;
	private String RunUsuario;

	// constructor vacio
	public Usuario() {
	}

	// contructor con atributos como parametros

	public Usuario(String NombreUsuario, String FechaNacimientoUsuario, String RunUsuario) {
		this.NombreUsuario = NombreUsuario;
		this.FechaNacimientoUsuario = FechaNacimientoUsuario;
		this.RunUsuario = RunUsuario;
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
	
	@Override
	public String toString() {
				return "USUARIO:" + "\n"+ "Nombre de usuario: " + NombreUsuario  + "\nFecha de Nacimiento: "+ FechaNacimientoUsuario + "\nRun del usuario: "+ RunUsuario;
}}