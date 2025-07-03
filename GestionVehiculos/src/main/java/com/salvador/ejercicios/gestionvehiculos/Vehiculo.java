/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salvador.ejercicios.gestionvehiculos;

import java.util.Iterator;
import java.util.UUID;

/**
 *
 * @author littlejxmmy
 */
abstract class Vehiculo {
    
    UUID id;
    String marca;
    String modelo;
    int anoFabricacion;
    
    abstract void mostrarInfo();

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacion=" + anoFabricacion + '}';
    }

    public Vehiculo(String marca, String modelo, int anoFabricacion) {
        this.id = UUID.randomUUID();
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
    }

    public UUID getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }
}
