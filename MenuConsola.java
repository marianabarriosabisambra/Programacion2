/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCiclos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuConsola {

   
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        
        int opcion = 0;
        
        for (; opcion != 5; ){
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar Nombre");
            System.out.println("2. Eliminar Nombre");
            System.out.println("3. Actualizar Nombre");
            System.out.println("4. Mostrar Nombres");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            
            if (opcion == 1) {
                System.out.print("Ingresa el nombre a agregar: ");
                String nombre = scanner.nextLine();
                nombres.add(nombre);
                System.out.println("El nombre ha sido agregado correctamente:) .");
            }
            
            else if (opcion == 2) {
                System.out.print("ingresa el nombre para eliminar: ");
                String nombreEliminar = scanner.nextLine();
                boolean encontrado = false;
                
                for (int i = 0; i < nombres.size(); i++){
                    if (nombres.get(i).equals(nombreEliminar)) {
                        nombres.remove(i);
                        encontrado = true;
                        System.out.println("El nombre ha sido eliminado correctamente :( . ");
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("El nombre no se encuentra !. ");
                    
                }
            }
            
            else if (opcion ==3 ){
                System.out.print("Ingresa el nombre a actualizar: ");
                String nombreActualizar = scanner.nextLine();
                boolean encontrado = false;
                
                for (int i = 0; i < nombres.size(); i++) {
                    if (nombres.get(i).equals(nombreActualizar)) {
                        System.out.print("Ingrese el nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        nombres.set(i, nuevoNombre);
                        encontrado = true;
                        System.out.println("El nombre ha sido actualizado correctamente :).");
                        break;
                    }
                }
                
                if (!encontrado) {
                    System.out.println("Error Nombre no encontrado.");
                    
                }
            
            }
            
            else if (opcion == 4) {
                System.out.println("\n Lista de nombres:");
                if (nombres.isEmpty()) {
                    System.out.println("La lista esta vacia.");
                }else{
                   for (int i = 0; i < nombres.size(); i++) {
                       System.out.println((i + 1)+ " . " + nombres.get(i));
                   }    
                }               
            }
            
            else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            }
            
            else {
                System.out.println("Opcion no valida. por favor intente nuevamente.");
            }
            
        }
        
        scanner.close();


        
    }
    
}
