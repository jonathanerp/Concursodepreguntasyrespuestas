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
        int k=0;
        for (int i=0;i<preguntas.size();i++){
            if(i==5 || i==10 || i==15 || i==20){
                k++;
            }
            for (int j=0;j<4;j++){
                System.out.println("\nIngrese la opcion # "+(j+1)+ " para la pregunta "+preguntas.get(i)+ " la cual tiene nivel de dificultad "+niveles.get(k));  
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
