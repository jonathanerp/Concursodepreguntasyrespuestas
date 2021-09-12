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
    static ArrayList <Integer> listapremios= new ArrayList<>();
    
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
                int n=0, resp1, ale=0;
                Acumulado acu= new Acumulado();
                Premios premios = new Premios();
                
                for (int i=0;i<numron;i++){
                    
                    ale=(int)(Math.random()*5);
                    System.out.println("\ntu nemero aleatorio es : "+ale);
                    
                    System.out.println("\nEmpezamos con la ronda # "+(i+1)+" la cual contiene 5 preguntas con nivel de dificultad "+niveles.get(n)+" que pertenece a la categoria #: "+categorias.get(n));
                    
                    System.out.println("\nla pregunta es :"+preguntas.get(numaleatorios.get(ale)+(5*i)));
                    System.out.println("\n opcion 1 :"+opciones.get((3*(numaleatorios.get(ale)+(5*i)))+(numaleatorios.get(ale)+(5*i))));
                    System.out.println("\n opcion 2 :"+opciones.get((3*(numaleatorios.get(ale)+(5*i)))+(numaleatorios.get(ale)+1+(5*i))));
                    System.out.println("\n opcion 3 :"+opciones.get((3*(numaleatorios.get(ale)+(5*i)))+(numaleatorios.get(ale)+2+(5*i))));
                    System.out.println("\n opcion 4 :"+opciones.get((3*(numaleatorios.get(ale)+(5*i)))+(numaleatorios.get(ale)+3+(5*i))));
                    
                    System.out.println("\ningresa tu respuesta con el # de la opcion correcta");
                    resp1=entrada.nextInt();
                    respuestasjugador.add(resp1);
                        
                    if(resp1 == respuestas.get(numaleatorios.get(ale)+(5*i))){
                        System.out.println("\n correcto");
                        System.out.println("\n felicidades ganaste la ronda #"+(i+1)+" por lo que te daremos "+(n+1)+"puntos");
                        premios.agregarPremio(n+1);
                        
                        if(i==4){
                        System.out.println("\n felicidades ganaste el juego");
                        listapremios=premios.ListaPremios();
                        acu.PuntosAcumulados(listapremios);
                        respw=0;
                        break;
                        }
                        
                        System.out.println("\nquieres continuar jugando? ingrese si o no(en caso de ingresar no te daremos los puntos acumulados)");
                        String resp2=entrada.next();
                        if("si".equals(resp2)){
                                                  
                        }
                        else{
                            System.out.println("\n te retiraste del juego");
                            listapremios=premios.ListaPremios();
                            acu.PuntosAcumulados(listapremios);
                            respw=0;
                            break;
                        }                  
                    }
                    else{
                        System.out.println("\nincorrecto perdiste todo tu acumulado");
                        System.out.println("\nGAME OVER");
                        respw=0;
                        break;
                    }
                    n++;
                }
            }
        }
    }
}