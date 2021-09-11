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
public class Categoria {
    ArrayList <Integer> categorias= new ArrayList<>();
    
    public Categoria(int num) {
        
        for (int i=1;i<(num+1);i++){
            System.out.println("\nSe creo la categoria #"+(i));  
            int cat=i;
            categorias.add(cat);
        }
    }
    ArrayList ListaCategorias() {
        System.out.println("\n"+categorias);
        return categorias;
    }
}
