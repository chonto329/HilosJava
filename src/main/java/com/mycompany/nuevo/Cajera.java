/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevo;

import java.util.List;

/**
 *
 * @author Juan
 */
public class Cajera extends Thread {

    //variable de cadena para guardar el nombre de la cajera
    private String nombre;

    /*
    Metodo constructor cajera
    Parametros: Cadena nombre
     */
    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    /*
    Metodo que realiza el proceso de compra 
    Parametros: Objeto cliente , entero largo para guardar el tiempo
     */
    public void procesarCompra(Cliente cliente, long timeStamp) {
        //comienza a procesar la compra
        System.out.println(nombre + " comienza a procesar la compra de "
                + cliente.getNombre() + " en el tiempo " + (System.currentTimeMillis() - timeStamp) / 1000
                + " segundos ");

        //Llama a el objeto compras para ver los productos
        List<Compra> compras = cliente.getCompras();
        for (Compra compra : compras) {
            System.out.println(nombre + " está procesando el producto  " + compra.getProducto() + " y el total es: " + compra.getTotal());
            try {
                // Simular el tiempo necesario para procesar cada compra
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //terminar de procesar la compra
        System.out.println(nombre + " ha terminado de procesar la compra de " + cliente.getNombre()
                + " en el tiempo " + (System.currentTimeMillis() - timeStamp) / 1000
                + " segundos ");

    }
}
