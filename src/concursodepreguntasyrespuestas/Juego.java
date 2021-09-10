/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursodepreguntasyrespuestas;

import java.util.Scanner;

/**
 *
 * @author JOESR
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int respw=1;
        while(respw==1){
            
            Scanner entrada=new Scanner(System.in);
            
            Jugador jug= new Jugador();
            jug.NombreJugador();
        
            NivelDeDificultad niv= new NivelDeDificultad();
            niv.ListaNiveles();
            int num=niv.NumNiveles();
        
            Categoria cat= new Categoria(num);
            cat.ListaCategorias();
        
            Rondas ron= new Rondas(num);
            int numron=ron.NumRondas();
            
            System.out.println("\nIniciar el juego? ingrese si o no(en caso de ingresar no te volvera a pedir los datos iniciales)");
            String resp=entrada.next();
            
        }
    }
}