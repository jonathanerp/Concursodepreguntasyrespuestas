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
public class NumAleatoriosSinRepetir {
    ArrayList <Integer> aleatorio= new ArrayList<>();
    
    public NumAleatoriosSinRepetir() {
        int r=0,can=5,arreglo[] = new int[can];
                    
        arreglo[r]=(int)(Math.random()*5);
        for(r=1; r<can;r++){
            arreglo[r]=(int)(Math.random()*5);
            for(int j=0; j<r; j++){
                if(arreglo[r]==arreglo[j]){
                    r--;
                }
            }
        }
        for(int k=0; k<can; k++){
            aleatorio.add(arreglo[k]);
        }    
    }
    ArrayList ListaNumAleatoriosSinRepetir() {
        System.out.println("\n"+aleatorio);
        return aleatorio;
    }
    
    
}
