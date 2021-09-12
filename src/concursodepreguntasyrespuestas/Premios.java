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
public class Premios {
    ArrayList <Integer> premios= new ArrayList<>();
    
    public Premios(){
    
    }
        
    void agregarPremio(int punto) {
        premios.add(punto);
    }
    
    ArrayList ListaPremios(){
        
        System.out.println("\nsu lista de premios es: "+premios);
        return premios;
    }
}
