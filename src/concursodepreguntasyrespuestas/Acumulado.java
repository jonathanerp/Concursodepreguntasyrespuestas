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
    ArrayList <Integer> acumulado= new ArrayList<>();
    
    public Acumulado(){
    
    }
    void agregarAcumulado(int punto) {
        acumulado.add(punto);
    }
    
}
