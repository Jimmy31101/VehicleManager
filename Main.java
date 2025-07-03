/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salvador.ejercicios.gestionvehiculos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author littlejxmmy
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        boolean verificar = false;
        
        System.out.println("###################");
        System.out.println("Gestor de vehículos");
        System.out.println("################### \n");
        
        do {
            
            System.out.println("""
                               1: Agrega un coche 
                               2: Agrega una moto 
                               3: Lista todos los vehículos 
                               4: Elimina un vehículo por su ID 
                               5: Filtra los vehículos por su tipo 
                               6: Salir del programa \n
                               """);
            
            int choice = sc.nextInt();
            
            switch(choice) {
                
                case 1:
                    
                    System.out.println("Introduce una marca de coches: ");
                    sc.nextLine();
                    String marca = sc.nextLine();
                    System.out.println("Introduce un modelo: ");
                    String modelo = sc.nextLine();
                    System.out.println("Introduce un año de fabricación: ");
                    int anoDeFabricacion = sc.nextInt();
                    System.out.println("Introduce el nº de puertas: ");
                    int puertas = sc.nextInt();
                    System.out.println();
                    
                    VehiculoCRUD.agregarVehiculo(new Coche(marca, modelo, anoDeFabricacion, puertas));
                    break;
                
                case 2: 
                   
                    System.out.println("Introduce una marca de motos: ");
                    sc.nextLine();
                    String Marca = sc.nextLine();
                    System.out.println("Introduce un modelo: ");
                    String Modelo = sc.nextLine();
                    System.out.println("Introduce un año de fabricación: ");
                    int AnoDeFabricacion = sc.nextInt();
                    System.out.println("¿Tiene sidecar? (true/false): ");
                    boolean tieneSidecar = sc.nextBoolean();
                    System.out.println();
                    
                    VehiculoCRUD.agregarVehiculo(new Moto(Marca, Modelo, AnoDeFabricacion, tieneSidecar));
                    break;
                    
                case 3:
                    
                    System.out.println("Estos son todos los vehículos: ");
                    VehiculoCRUD.listarVehiculos();
                    break;
                    
                case 4:
                    
                    System.out.println("Introduce el id del vehículo a eliminar: ");
                    sc.next();
                    String id = sc.nextLine();
                    VehiculoCRUD.eliminarVehiculo(id);
                    break;
                    
                case 5:
                    
                    System.out.println("Listado de coches:");
                    VehiculoCRUD.listarPorTipo("Coche");
                    System.out.println("Listado de motos:");
                    VehiculoCRUD.listarPorTipo("Moto");
                    break;
                    
                case 6:
                    
                    System.out.println("Saliendo del programa...");
                    verificar = true;
                    break;
                    
                default:
                    
                    break;
                    
            } 
            
        } while (!verificar);
        
        VehiculoCRUD.guardarVehiculos();
        
        sc.close();
        
    }
}
