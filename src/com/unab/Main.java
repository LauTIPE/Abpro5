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
        // Crear instancias de las clases.
    	
    	Cliente cliente = new Cliente(99999999, "José Miguel", "Acevedo Acevedo", 555555, "Modelo", 2 , "calle 1", "viña", 99);
    	Usuario usuario = new Usuario("Pepe", "20 de Abril", "98765432-1");
    	Capacitacion capacitacion = new Capacitacion(1, "12345678-9", "Martes", "10:00", "Sala 1", 4, 20);
        
               
        // Desplegar los datos de la capacitación utilizando el método toString()
    	System.out.println(cliente.toString());
    	System.out.println(usuario.toString());
    	System.out.println(capacitacion.toString());
    }
}
