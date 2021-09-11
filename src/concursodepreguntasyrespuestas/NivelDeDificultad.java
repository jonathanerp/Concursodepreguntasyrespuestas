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
public class NivelDeDificultad {
    ArrayList <String> niveles= new ArrayList<>();
    
    public NivelDeDificultad() {
        
        Scanner entrada=new Scanner(System.in);        
        
        for (int i=0;i<5;i++){
            System.out.println("\ningrese el nombre del nivel de dificultad #"+(i+1));  
            String nombre=entrada.next();
            niveles.add(nombre);
        }
    }
    ArrayList ListaNiveles() {
        System.out.println("\n"+niveles);
        return niveles;
    }
    int NumNiveles() {
        int num=niveles.size();
        System.out.println("\ntiene "+num+ " niveles de dificultad");
        return num;
    }
}
