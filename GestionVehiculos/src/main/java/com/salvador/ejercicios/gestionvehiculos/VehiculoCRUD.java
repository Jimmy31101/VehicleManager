/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salvador.ejercicios.gestionvehiculos;

import static com.salvador.ejercicios.gestionvehiculos.VehiculoCRUD.almacenVehiculos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author littlejxmmy
 */
public class VehiculoCRUD {

    public static ArrayList<Vehiculo> almacenVehiculos = new ArrayList<>();

    public static void agregarVehiculo(Vehiculo v) {

        almacenVehiculos.add(v);
        
    }
    
    public static void listarVehiculos() {
        
        if (almacenVehiculos.isEmpty()) {
            
            System.out.println("No hay vehículos almacenados");
            
        } else {
            
            for (Vehiculo i : almacenVehiculos) {

                if(i instanceof Coche coche) {

                System.out.println(i.getId() + "\t" + i.getMarca() + "\t" + i.getModelo() + "\t" + i.getAnoFabricacion() + "\t" + coche.getPuertas());

                } if (i instanceof Moto moto) {

                System.out.println(i.getId() + "\t" + i.getMarca() + "\t" + i.getModelo() + "\t" + i.getAnoFabricacion() + "\t" + moto.getTieneSidecar());

                }
            }
        }
    }

    public static void eliminarVehiculo(String id) {
        
        for (Vehiculo i : almacenVehiculos) {
            
            if(id == i.getId().toString()) {
                
                almacenVehiculos.remove(i);
                System.out.println("Se ha eliminado el vehículo con id: " + id);
                
            } else {
                
                System.out.println("No se ha encontrado ningún vehículo con el ID introducido");
            }
            
        }
    }

    public static void listarPorTipo(String tipo) {
        
        for (Vehiculo i : almacenVehiculos) {

            if (i instanceof Coche && "Coche".equals(tipo)) {
                
                System.out.println("Listado de coches: ");
                Coche.class.toString();
            }
            
            if (i instanceof Moto && "Moto".equals(tipo)) {
                
                System.out.println("Listado de motos: ");
                Moto.class.toString();
            }
        }
    }

    public static void guardarVehiculos() throws IOException {

        /*File archivoVehiculos = new File("vehiculos.txt");

        if (archivoVehiculos.createNewFile()) {

            System.out.println("Fichero " + archivoVehiculos.getName() + " creado");
            FileWriter escritorDeFichero = new FileWriter("vehiculos.txt");

            for (Vehiculo i : almacenVehiculos) {
                if (i instanceof Coche) {

                    escritorDeFichero.write(i.getId() + "\t" + i.getMarca() + "\t" + i.getModelo() + "\t" + i.getAnoFabricacion() + "\t" + ((Coche) i).getPuertas());
                    escritorDeFichero.write("\n");

                } else if (i instanceof Moto) {

                    escritorDeFichero.write(i.getId() + "\t" + i.getMarca() + "\t" + i.getModelo() + "\t" + i.getAnoFabricacion() + "\t" + ((Moto) i).getTieneSidecar());
                    escritorDeFichero.write("\n");

                }

            }

            escritorDeFichero.close();
            System.out.println("Fichero creado con éxito.");

        }*/
        
        File f = new File("vehículo.txt");
        f.delete();
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("vehículo.txt", true))) {

            for (Vehiculo i : almacenVehiculos) {
                
                switch (i) {
                    
                    case Coche coche -> {
                        
                        bw.write("ID: " + i.getId() + " Marca: " + i.getMarca() + " Modelo: " + i.getModelo() + " Año de Fabricación: " + i.getAnoFabricacion() + " Nº de puertas: " + coche.getPuertas());
                        bw.newLine();
                        
                    }
                    case Moto moto -> {
                        
                        bw.write("ID: " + i.getId() + " Marca: " + i.getMarca() + " Modelo: " + i.getModelo() + " Año de Fabricación: " + i.getAnoFabricacion() + " Sidecar: " + moto.getTieneSidecar());
                        bw.newLine();
                        
                    }
                    default -> {
                        
                    }
                }
            }
            
        } catch (IOException e) {

            System.out.println("Error al escribir en el archivo: " + e.getMessage());

        }

    }

    public static void cargarVehiculos() {

        try (BufferedReader br = new BufferedReader(new FileReader("vehículo.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {

                System.out.println(line);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al leer el fichero" + e.getMessage());

        }

    }
}
