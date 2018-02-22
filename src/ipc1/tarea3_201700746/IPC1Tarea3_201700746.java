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
       
        int opcion, opcion2, salir;
        Scanner entrada = new Scanner (System.in);
        Scanner entrada2 = new Scanner (System.in);
        Scanner us = new Scanner (System.in);
        
        String[] usuarios = new String[5];

        salir = 0;
        
        
        while(salir != 5){
        boolean menu = true;
        
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
                
                
                switch (opcion2){
                    
                    case 1: 
                        
                        for(int user = 0; user < 5 ;user++){
                            
                           usuarios[user] = us.next();
                           
                            menu2=false;
                        }
                        break;
                    
                    case 2:
                        int user2;
                        for( user2 = 0 ; user2 < 5 ; user2++){
                            
                            System.out.println(usuarios[user2]);
                            
                        
                        }
                        if (user2 >= 4){
                            menu2=false;
                        }
                        break;
                        
                        
                        
                    case 4:
                        
                        menu = false;
                        
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
                
                switch (opcion2){
                    case 4:
                        menu = false;
                        break;
                        
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
                
                opcion2 = entrada2.nextInt();
                
                switch (opcion2){
                    case 4:
                        menu = false;
                        break;
                        
                }
                
                break;
                
            case 4:
                
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                
             
                
                break;
 
     
            default:
              System.exit(0);
                break;
        }
        
       
    }
        
        }
    }
}
