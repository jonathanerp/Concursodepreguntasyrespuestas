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
public class Acumulado {
    
    
    public Acumulado(){
    
    }
    
    public int PuntosAcumulados(ArrayList ListaPremios) {
        int suma =0;
        
        for (int i=0;i<ListaPremios.size();i++){
            
            suma=suma+(int)ListaPremios.get(i);
            
        }
        System.out.println("la suma de los puntos da :"+suma+" puntos Puntaje Perfecto");
        return suma;
    }
}
