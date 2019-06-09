/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepa;

import java.util.Scanner;

/**
 *
 * @author vpala
 */
public class Pepa {
    private static boolean string;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int numero1 ;
     String operador = "" ;
     int numero2 ; 
     int x;
     Scanner calculadora = new Scanner (System.in);
     Scanner calculadora2 = new Scanner (System.in); 
        System.out.println("Escriba el 1er # :");
        
     numero1 = calculadora.nextInt();
        System.out.println("escriba el operador");
   
     operador =calculadora2.nextLine();
        System.out.println(operador);
        System.out.println("escriba el 2do #");
     numero2 = calculadora.nextInt();
    
        if ("+".equals(operador)||"-".equals(operador)||"*".equals(operador)||"/".equals(operador)) {
             if("+".equals(operador)) {
                 x= numero1 + numero2;
                  System.out.println("numero1 + numero 2 = "+ x);
                  
             }
             if("-".equals(operador)){
                 x= numero1 - numero2;
                 System.out.println("numero1 - numero 2 ="+ x); 
                
             }    
             if ("/".equals(operador) ){
                 x= numero1/ numero2;
                System.out.println("numero1 / numero 2 ="+ x);
             }    
             if ("*".equals(operador)){
                 x= numero1 * numero2;
                 System.out.println("numero1 * numero2 ="+ x);}
            
        }else{
            System.out.println("Solo se pueden estos operadores * / - +");     
        }   
                 
                 
    }}
 
                 
             
                     
              
                     
                 
                 
                 
                 
                 
                 
             
             
    
    

