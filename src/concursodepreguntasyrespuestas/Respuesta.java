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
public class Respuesta {
     ArrayList <Integer> respuesta= new ArrayList<>();
    
    public Respuesta(ArrayList niveles,ArrayList preguntas) {
        
        Scanner entrada=new Scanner(System.in);   
        int k=0;
        
        for (int i=0;i<preguntas.size();i++){
            if(i==5 || i==10 || i==15 || i==20){
                k++;
            }
            System.out.println("\nIngrese el numero de la opcion correcta para la pregunta "+preguntas.get(i)+" la cual tiene nivel de dificultad "+niveles.get(k));  
            int rep=entrada.nextInt();
            respuesta.add(rep);
        }
    }
    ArrayList ListaRespuesta() {
        System.out.println("\n"+respuesta);
        return respuesta;
    }
    
}
