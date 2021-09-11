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
public class Preguntas {
    
    ArrayList <String> preguntas= new ArrayList<>();
    
    public Preguntas(ArrayList niveles,ArrayList categorias) {
        
        Scanner entrada=new Scanner(System.in);   
        
        for (int i=0;i<niveles.size();i++){
            for (int j=0;j<categorias.size();j++){
                System.out.println("\nIngrese la pregunta # "+(j+1)+ " que tenga un nivel de dificultad "+niveles.get(i));  
                String nombre=entrada.nextLine();
                preguntas.add(nombre);
            }
        }
    }
    ArrayList ListaPreguntas() {
        System.out.println("\n"+preguntas);
        return preguntas;
    }
}