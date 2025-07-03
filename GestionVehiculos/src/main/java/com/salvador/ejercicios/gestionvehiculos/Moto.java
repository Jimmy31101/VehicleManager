/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salvador.ejercicios.gestionvehiculos;


/**
 *
 * @author littlejxmmy
 */
public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int anoFabricacion, boolean tieneSidecar) {
        super(marca, modelo, anoFabricacion);
        
        this.tieneSidecar = tieneSidecar;
    }

    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    
    @Override
    void mostrarInfo() {

        System.out.println("id: " + Moto.super.getId());
        System.out.println("Marca: " + Moto.super.getMarca());
        System.out.println("Modelo: " + Moto.super.getModelo());
        System.out.println("Año Fabricación: " + Moto.super.getAnoFabricacion());
        System.out.println("Sidecar: " + Moto.this.getTieneSidecar());
    }
}
