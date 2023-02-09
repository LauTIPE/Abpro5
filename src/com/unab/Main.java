/**
Clase Main que crea instancias de las clases Cliente, Usuario y Capacitación
y muestra los datos de estas instancias utilizando el método toString().
@author Consuelo, Javiera, Lautaro, Moisés
@version 1.0
@since 2023-02-06
*/
package com.unab;

public class Main {
	/**
	* Método principal que crea instancias de las clases Cliente, Usuario y Capacitación
	* y muestra los datos de estas instancias utilizando el método toString().
	*
	* @param args Arreglo de argumentos pasados por línea de comandos.
	*/
	
    public static void main(String[] args) {
        
    	// Crear 2 instancias de las clases.
    	Cliente cliente1 = new Cliente();
    	Cliente cliente2 = new Cliente();
    	Usuario usuario1 = new Usuario();
    	Usuario usuario2 = new Usuario();
    	Capacitacion capacitacion1 = new Capacitacion();
    	Capacitacion capacitacion2 = new Capacitacion();
    	    	             
    	// Modificar dos atributos de cada instancia
    	cliente1.setEdad(1989, 10, 2);
    	cliente2.setEdad(1994, 8, 8);
    	usuario1.setNombreUsuario("Moises");
    	usuario2.setRunUsuario("22.869.854-2");   	
    	capacitacion1.setCantidadAsistentes(30);
    	capacitacion2.setCantidadAsistentes(18);
    	
    	// Desplegar los datos de la capacitación utilizando el método toString()
    	System.out.println(cliente1.toString());
    	System.out.println("\n");
    	System.out.println(usuario1.toString());
    	System.out.println("\n");
    	System.out.println(capacitacion1.toString());
    	System.out.println("\n");
    	System.out.println(cliente2.toString());
    	System.out.println("\n");
    	System.out.println(usuario2.toString());
    	System.out.println("\n");
    	System.out.println(capacitacion2.toString());
    	System.out.println("\n");
        	
    	
    	// Desplegar los datos de la capacitación utilizando el método toString()
    	System.out.println("Datos de la capacitación 1: ");
    	System.out.println("Identificador: " + capacitacion1.getIdentificador());
    	System.out.println("RUT cliente: " + capacitacion1.getRutCliente());
    	System.out.println("Día: " + capacitacion1.getDia());
    	System.out.println("Hora: " + capacitacion1.getHora());
    	System.out.println("Lugar: " + capacitacion1.getLugar());
    	System.out.println("Duración: " + capacitacion1.getDuracion() + " minutos");
    	System.out.println("Cantidad de asistentes: " + capacitacion1.getCantidadAsistentes());
    	System.out.println("Detalle: " + capacitacion1.mostrarDetalle());
    	System.out.println("\n");
    	System.out.println("Datos de la capacitación 2: ");
    	System.out.println("Identificador: " + capacitacion1.getIdentificador());
    	System.out.println("RUT cliente: " + capacitacion1.getRutCliente());
    	System.out.println("Día: " + capacitacion1.getDia());
    	System.out.println("Hora: " + capacitacion1.getHora());
    	System.out.println("Lugar: " + capacitacion1.getLugar());
    	System.out.println("Duración: " + capacitacion1.getDuracion() + " minutos");
    	System.out.println("Cantidad de asistentes: " + capacitacion1.getCantidadAsistentes());
    	System.out.println("Detalle: " + capacitacion1.mostrarDetalle());
    }
}
