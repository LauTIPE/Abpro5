/**
 * 
 */
package com.unab;

import java.time.LocalDate;
import java.time.Period;

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
	private int añoNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;

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
	 * /**- obtenerSistemaSalud(): de acuerdo al valor registrado en el objeto, despliega el tipo de
	 *sistema de salud
	 */

	public void getSistemaSalud() {
        if (sistemaSalud == 1) {
            System.out.println("Sistema de Salud: Isapre");
        } else if (sistemaSalud == 2) {
            System.out.println("Sistema de Salud: Fonasa");
        } else {
            System.out.println("Sistema de Salud desconocido");
        } return;
    }
	/**
	 * @param sistemaSalud the sistemaSalud to set
	 */
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
	
	//metodo
	
	
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
	
	/*obtenerNombre(): retorna un String con el nombre completo del cliente (nombres +
	 *apellidos)
	 */
	 public String obtenerNombre() {
	        return nombres + " " + apellidos;
	    }
	 //calcular la edad con la fecha de nacimiento
	 
	 public int getEdad() {
		    return edad;
		}

		public static int calcularEdad(int año, int mes, int dia) {
		    if (año > 0 && mes > 0 && mes <= 12 && dia > 0 && dia <= 31) {
		        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
		        LocalDate hoy = LocalDate.now();
		        Period periodo = Period.between(fechaNacimiento, hoy);
		        return periodo.getYears();
		    } else {
		        System.out.println("Fecha de nacimiento inválida.");
		        return -1;
		    }
		}

		public void setEdad(int año, int mes, int dia) {
		    int edadCalculada = calcularEdad(año, mes, dia);
		    if (edadCalculada != -1) {
		        this.edad = edadCalculada;
		    } else {
		        System.out.println("No se pudo establecer la edad.");
		    }
		}


	    
//metodo toString
		
	public String toString() {
	  
	    return "Cliente: " + '\n' +
	        "RUT: " + RUT + '\n' +
	        "nombres: '" + nombres + '\n' +
	        "apellidos: " + apellidos + '\n' +
	        "telefono: " + telefono + '\n' +
	        "afp: " + afp + '\n' +
	        "sistemaSalud: " + sistemaSalud + '\n' +
	        "direccion: " + direccion + '\n' +
	        "comuna: " + comuna + '\n' +
	        "edad: " + edad;
	}
}
