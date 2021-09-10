/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursodepreguntasyrespuestas;

import java.util.ArrayList;

/**
 *
 * @author JOESR
 */
public class NivelDeDificultad {
    ArrayList <Integer> niveles= new ArrayList<>();
    
    public NivelDeDificultad() {
                
        for (int i=1;i<6;i++){
            System.out.println("\nSe creo el nivel de dificultad #"+(i));  
            int nombre=i;
            niveles.add(nombre);
        }
    }
    void ListaNiveles() {
        System.out.println("\n"+niveles);
    }
    int NumNiveles() {
        int num=niveles.size();
        System.out.println("\ntiene "+num+ " niveles de dificultad");
        return num;
    }
}
