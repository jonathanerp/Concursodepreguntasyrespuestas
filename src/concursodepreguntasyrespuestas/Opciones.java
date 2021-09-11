/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursodepreguntasyrespuestas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JOESR
 */
public class Opciones {
    ArrayList <String> opciones= new ArrayList<>();
    
    public Opciones(ArrayList niveles,ArrayList preguntas) {
        
        Scanner entrada=new Scanner(System.in);   
        
        for (int i=0;i<preguntas.size();i++){
            for (int j=0;j<4;j++){
                System.out.println("\nIngrese la opcion # "+(j+1)+ " para la pregunta "+preguntas.get(i));  
                String nombre=entrada.nextLine();
                opciones.add(nombre);
                
            }
        }
    }
    ArrayList ListaOpciones() {
        System.out.println("\n"+opciones);
        return opciones;
    }
}
