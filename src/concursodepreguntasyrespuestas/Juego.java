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
public class Juego {
    static ArrayList <String> niveles= new ArrayList<>();
    static ArrayList <Integer> categorias= new ArrayList<>();
    

    public static void main(String[] args) {
        
        int respw=1;
        while(respw==1){
            
            Scanner entrada=new Scanner(System.in);
            
            Jugador jug= new Jugador();
            jug.NombreJugador();
        
            NivelDeDificultad niv= new NivelDeDificultad();
            niveles=niv.ListaNiveles();
            int num=niv.NumNiveles();
        
            Categoria cat= new Categoria(num);
            categorias=cat.ListaCategorias();
        
            Rondas ron= new Rondas(num);
            int numron=ron.NumRondas();
            
            Preguntas pre= new Preguntas(niveles,categorias);
            
            System.out.println("\nIniciar el juego? ingrese si o no(en caso de ingresar no te volvera a pedir los datos iniciales)");
            String resp=entrada.next();
            if("si".equals(resp)){
                for (int i=1;i<(numron+1);i++){
                    System.out.println("Empezamos ");
                }
            }
        }
    }
}