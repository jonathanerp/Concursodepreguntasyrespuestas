/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursodepreguntasyrespuestas;

import java.util.Scanner;

/**
 *
 * @author JOESR
 */
public class Jugador {
    
    String nombre;
    public Jugador() {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");  
        String _nombre=entrada.next();
        this.nombre=_nombre;
    }
    
    String NombreJugador() {
        System.out.println("\nBienvenido "+nombre);
        return nombre;
    }
    

}
