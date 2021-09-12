/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursodepreguntasyrespuestas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author JOESR
 */
public class PersistenciaDeDatos {
    
    public PersistenciaDeDatos(){
        File archivo = new File("D:\\persistenciadedatos.txt");
        try {
            PrintWriter pc = new PrintWriter(archivo);
            pc.close();
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    void datos(String jugador,int total,ArrayList ListaPremios){
        File archivo = new File("D:\\persistenciadedatos.txt");
        try {
            PrintWriter pc = new PrintWriter(archivo);
            pc.println("\nFelicidades Jugador "+jugador+" ganaste con un total de "+total+" Puntos");
            
            for (int i=0;i<ListaPremios.size();i++){
                 pc.println("\nCATEGORIA # "+i+" RONDA  # "+i+" PUNTOS "+ListaPremios.get(i)+" GANADOS ");
            }
            
            pc.close();
            System.out.println("se creo el archivo en el disco local D");
        } 
        catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

    

