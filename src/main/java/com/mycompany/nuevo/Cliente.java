/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Cliente {
    
    //variable de cadena para guardar el nombre del cliente
    private String nombre;
    //Lista de objeto compra para guardar las compras
    private List<Compra> compras;

    /*
    Metodo constructor cliente
    Parametros: Cadena nombre, Lista de objeto compra
    */
    public Cliente(String nombre, List<Compra> compras) {
        this.nombre = nombre;
        this.compras = compras;
    }

    //metodo de Cadena que devuelve el nombre del cliente
    public String getNombre() {
        return nombre;
    }
    //Metodo que devuelve una lista de las compras del cliente
    public List<Compra> getCompras() {
        return compras;
    }

}
