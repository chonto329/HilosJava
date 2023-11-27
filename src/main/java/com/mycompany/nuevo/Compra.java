/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevo;

/**
 *
 * @author Juan
 */
public class Compra {

    //variable de cadena para guardar el nombre del producto
    private String producto;
    //variable doble para guardar el precio del producto
    private double costo;
    //variable entero para guardar la cantidad de productos
    private int cantidad;

    /*
    metodo constructor compra
    parametros: cadena producto, doble costo, entero cantidad
    */
    public Compra(String producto, double costo, int cantidad) {
        this.producto = producto;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    //metodo de Cadena que devuelve el nombre del producto
    public String getProducto() {
        return producto;
    }
    //Metodo doble que devuelve el costo
    public double getCosto() {
        return costo;
    }
    //Metodo entero que devuelve la cantidad
    public int getCantidad() {
        return cantidad;
    }
    //Metodo doble que devuelve el total de costo * cantidad
    public double getTotal() {
        return costo * cantidad;
    }
}
