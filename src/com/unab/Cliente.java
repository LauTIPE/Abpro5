/**
 * 
 */
package com.unab;

public class Cliente {
	
//atributo
	private int RUT;
	private String nombres;
	private String apellidos;
	private int telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	
//constructor sin parametro
	public Cliente() {}
// constructor	
	public Cliente(int RUT, String nombres, String apellidos, int telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
	    this.RUT = RUT;
	    this.nombres = nombres;
	    this.apellidos = apellidos;
	    this.telefono = telefono;
	    this.afp = afp;
	    this.sistemaSalud = sistemaSalud;
	    this.direccion = direccion;
	    this.comuna = comuna;
	    this.edad = edad;
	}
//metodos
	public int getRUT() {
	    return RUT;
	}

	public void setRUT(int RUT) {
	    if (RUT < 0 || RUT > 99999999) {
	        System.out.println("RUT inválido.");
	        return;
	    }
	    this.RUT = RUT;
	}


	public String getNombres() {
	    return nombres;
	}
    
	public void setNombres(String nombres) {
	    this.nombres = nombres;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}
	/**
	 * @param afp the afp to set
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}
	/**
	 * @return the sistemaSalud
	 */
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	/**
	 * @param sistemaSalud the sistemaSalud to set
	 */
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}
	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

//metodo toString
		
	public String toString() {
		
		    String sistemaSaludString;
		    if (sistemaSalud == 1) {
		        sistemaSaludString = "Sistema de Salud: Isapre " + '\n';
		    } else if (sistemaSalud == 2) {
		        sistemaSaludString = "Sistema de Salud: Fonasa " + '\n';
		    } else {
		        sistemaSaludString = "";
		    }
		    return "CLIENTE: " + '\n' +
	            "RUT: " + RUT + '\n' +
	            "nombres: " + nombres + '\n' +
	            "apellidos: " + apellidos + '\n' +
	            "telefono: " + telefono + '\n' +
	            "afp: " + afp + '\n' +
	            sistemaSaludString +
	            "direccion: " + direccion + '\n' +
	            "comuna: " + comuna + '\n' +
	            "edad: " + edad;
	}

	
	
}
