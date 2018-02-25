/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201700746;

import java.util.Scanner;

/**
 *
 * @author Mauricio Suarez
 */
public class IPC1Tarea3_201700746 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int opcion, opcion2, salir, user, numay=0, numen=0, numed=0;
        int num=0;
        
        int cant=1;
        
        Scanner entrada = new Scanner (System.in);
        Scanner entrada2 = new Scanner (System.in);
        Scanner us = new Scanner (System.in);
        Scanner dig = new Scanner (System.in);
        Scanner nums = new Scanner (System.in);
        Scanner mat = new Scanner (System.in);
        //inicie todas las entradas
        
        
        String[] usuarios = new String[5];
        //aqui declare un array para los usuarios
        salir = 0;
        
        
        while(salir != 5){
            //este while es para salir de la aplicacion
            
        boolean menu = true;
        //esto sirve para regresar al menu principal
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println( "[IPC1]Tarea3_201700746");
        System.out.println( "1.Usuarios");
        System.out.println( "2.Contador de digitos");
        System.out.println( "3.Tres numeros de mayor a menor");
        System.out.println( "4.Calcular promedio");
        System.out.println( "5.Salir");
        
        System.out.println();
        System.out.println();
        System.out.print( "Ingrese opcion: ");
        
        
        opcion = entrada.nextInt();
        opcion2 = 0;
        
        
        while(menu){   
            
            
        switch (opcion) {
        //siwttch del menu principal
            case 1:
                
                boolean menu2 = true;
                
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                
                System.out.println( "1.Ingresar Usuarios");
                System.out.println( "2.Mostrar Usuarios ascendente");
                System.out.println( "3.Mostrar Usuarios descendente");
                System.out.println( "4.Menu principal");
                
                System.out.println();
                System.out.println();
                System.out.print( "Ingrese opcion: ");
                
                opcion2 = entrada2.nextInt();
                
                while(menu2){ 
                //while para regresar al menu usuarios
                
                switch (opcion2){
                    
                    case 1: 
                        
                        for(user = 0; user < 5 ;user++){
                            
                           usuarios[user] = us.next();
                           
                        }
                        //for de entrada del array
                        menu2=false;
                       
                        
                        break;
                    
                    case 2:
                        
                         
                        for( user=4 ; user>-1 ; user-- ){
                            
                            System.out.println(usuarios[user]);
                        
                        }
                        //muestra el array invertido
                        menu2=false;
                        break;
                      
                        
                    case 3:
                    
                        for(user=0; user<5;user++){
                            
                            System.out.println(usuarios[user]);
                        }
                        //muestra el array como se ingreso
                        menu2=false;
                        break;
                        
                        
                    case 4:
                        menu2=false;
                        menu = false;
                        //regresa al menu principal
                        break;    
                }
                
                }
               
                break;
                        
        
            case 2:
                
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                
                System.out.println( "1.Ingresar numero");
                System.out.println( "2.Mostrar numero de digitos");
                System.out.println( "4.Menu principal");
                
                System.out.println();
                System.out.println();
                System.out.print( "Ingrese opcion: ");
                
                
                opcion2 = entrada2.nextInt();
                
                boolean menu3 = true;
                
                
                
                 while(menu3){ 
                     //while para regresar al menu contador
                switch (opcion2){
                    //Switch del menu contador
                    case 1:
                        
                        System.out.println( "Ingresar numero");
                        
                        num = dig.nextInt();
                        if (num >100000){
                            System.out.println("ERROR");
                          
                            num=0;
                            //lectura y aprobacion del dato ingresado
                        }
                        menu3=false;
                        
                        break;
                        
                    case 2:
                         for(int cont = 10 ; cont < 100001 ; cont= cont*10 ){
                             
                             if(num>cont){
                                 
                                 cant=cant+1;
                               
                             }
                             //if para encontrar numero de digitos
                         }
                        System.out.println("El numero "+ num + " tiene " + cant + " digitos");
                        menu3=false;
                        break;
                    
                    case 4:
                        menu3=false;
                        menu = false;
                        break;
                        
                        
                }
        }
                break;

            case 3:
                
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                
                System.out.println( "1.Ingresar numeros");
                System.out.println( "2.Mostrar ordenados");
                System.out.println( "4.Menu principal");
                
                System.out.println();
                System.out.println();
                System.out.print( "Ingrese opcion: ");
                
                boolean menu4 = true;
                
                opcion2 = entrada2.nextInt();
                while(menu4){ 
                switch (opcion2){
                    
                    case 1:
                        
                        
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println( "Ingrese 3 numeros");
                         
                        int num1 = nums.nextInt();
                        int num2 = nums.nextInt();
                        int num3 = nums.nextInt();
                        
                    if(num1>num2&&num1>num3){
                         numay=num1;
                         if(num2>num3){
                             numed = num2;
                             numen = num3;
                         }else{
                             numed = num3;
                             numen = num2;
                         }
                    }else{
                         if(num2>num1&&num2>num3){
                                numay = num2;
                          if(num1>num3){
                             numed = num1;
                             numen = num3;
                          }else{
                             numed = num3;
                             numen = num1;
                         } 
                            }else{
                             numay=num3;
                             if(num1>num2){
                                 numed = num1;
                                 numen = num2;
                             }else{
                                 numed = num2;
                                 numen = num1;
                             }
                         }
                    }
                    //if anidados para encontrar el orden correcto de los numeros
                    menu4 = false;
                    break;
                    
                    case 2:
                         
                        System.out.println();
                        System.out.println();
                        System.out.println(); 
                        System.out.println(numen);
                        System.out.println(numed);
                        System.out.println(numay);
                        
                    menu4=false;
                    break;
                    
                    case 4:
                        menu4 = false;
                        menu = false;
                        break;
                        
                }
                }
                break;
                
            case 4:
                //creacion de matriz
                int matriz2[][] = new int[6][6];
                int fi, co,promedio=0,res=0;
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                //for para leer matriz pero no funciona
                for (fi  = 0; fi <(matriz2.length) ; fi++) {
                    for ( co = 0; co < (matriz2.length) ; co++) {
                        
                        System.out.print((fi+1) + "   ");
                        matriz2[fi][co]= mat.nextInt();
                        promedio = promedio + matriz2[fi][co];
                }
                    res= promedio/5;
                    matriz2[fi][6]=res;
                    System.out.print("\t"+matriz2[fi][6]+" ");
                }
                menu4=false;
                break;
 
            
            default:
              System.exit(0);
              //cierra el programa
                break;
        }
        
       
    }
        
        }
    }
}
