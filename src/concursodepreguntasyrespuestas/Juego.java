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
    static ArrayList <String> preguntas= new ArrayList<>();
    static ArrayList <String> opciones= new ArrayList<>();
    static ArrayList <Integer> respuestas= new ArrayList<>();
    static ArrayList <Integer> numaleatorios= new ArrayList<>();
    static ArrayList <Integer> respuestasjugador= new ArrayList<>();
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
            preguntas=pre.ListaPreguntas();
            
            Opciones op= new Opciones(niveles,preguntas);
            opciones=op.ListaOpciones();
            
            Respuesta re= new Respuesta(niveles,preguntas);
            respuestas=re.ListaRespuesta();
            
            System.out.println("\nIniciar el juego? ingrese si o no(en caso de ingresar no te volvera a pedir los datos iniciales)");
            String resp=entrada.next();
            if("si".equals(resp)){
                int n=-1;
                
                for (int i=0;i<numron;i++){
                    
                    NumAleatoriosSinRepetir nu= new NumAleatoriosSinRepetir();
                    numaleatorios=nu.ListaNumAleatoriosSinRepetir();
                    
                    for (int j=0;j<numron;j++){
                        
                        System.out.println("\nEmpezamos con la ronda # "+(i+1)+" la cual contiene 5 preguntas con nivel de dificultad "+niveles.get(n));
                        System.out.println("\nla pregunta es :"+preguntas.get(numaleatorios.get(i)));
                        System.out.println("\n opcion 1 :"+opciones.get((3*numaleatorios.get(i))+numaleatorios.get(i)));
                        System.out.println("\n opcion 2 :"+opciones.get((3*numaleatorios.get(i))+numaleatorios.get(i)+1));
                        System.out.println("\n opcion 3 :"+opciones.get((3*numaleatorios.get(i))+numaleatorios.get(i)+2));
                        System.out.println("\n opcion 4 :"+opciones.get((3*numaleatorios.get(i))+numaleatorios.get(i)+3));
                        System.out.println("\ningresa tu respuesta con el # de la opcion correcta");
                        int resp1=entrada.nextInt();
                        respuestasjugador.add(resp1);
                    }
                    n++;
                }
            }
        }
    }
}