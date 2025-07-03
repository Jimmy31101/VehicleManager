/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salvador.ejercicios.gestionvehiculos;


/**
 *
 * @author littlejxmmy
 */
public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String marca, String modelo, int anoFabricacion, int puertas) {
        super(marca, modelo, anoFabricacion);
        
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    @Override
    void mostrarInfo() {

        System.out.print("id: " + Coche.super.getId());
        System.out.print("Marca: " + Coche.super.getMarca());
        System.out.print("Modelo: " + Coche.super.getModelo());
        System.out.print("Año Fabricación: " + Coche.super.getAnoFabricacion());
        System.out.print("Nº puertas: " + Coche.this.getPuertas());
    }
}
