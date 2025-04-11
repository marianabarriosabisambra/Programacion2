/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean ciclo = true;
        Scanner lectura = new Scanner(System.in);

        double nota1 = 0, nota2  = 0, nota3 = 0;
        
        while(ciclo){
            System.out.println("Menu Principal:");
            System.out.println("1. Digitar Nota1");
            System.out.println("2. Digitar Nota2");
            System.out.println("3. Digitar Nota3");
            System.out.println("4. Calcular Nota Final");
            System.out.println("5. SALIR");
            System.out.println("Digite una Opcion: ");
            
            int opcion = lectura.nextInt();
            
            switch (opcion){
                case 1 -> {
                    System.out.print("Ingresa Nota 1: ");
                    nota1 = lectura.nextDouble();
                    
                }
                case 2 -> {
                    System.out.print("Ingresa Nota 2: ");
                    nota2 = lectura.nextDouble();
                }
                case 3 -> {
                    System.out.print("Ingresa Nota 3: ");
                    nota3 = lectura.nextDouble();                   
                }
                case 4 -> {
                    double notaFinal = (nota1 + nota2 + nota3) /3;
                    System.out.println("La Nota Final es: " + notaFinal);
                }
                case 5 -> {
                    ciclo = false;
                    System.out.println("Au revoir...");
                }
                default -> System.out.println("Opcion Invalida. try again.");
            }
            
            System.out.println();
        }
        
        lectura.close();
    }
    
}


    
    

