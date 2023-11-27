/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.nuevo;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Nuevo {

    public static void main(String[] args) {
        
        // Crear cajeras
        Cajera cajera1 = new Cajera("Cajera 1");
        Cajera cajera2 = new Cajera("Cajera 2");

        //se inicializa el tiempo en milisegundos 
        long initialTime = System.currentTimeMillis();

        // Crear clientes con compras
        List<Compra> comprasCliente1 = new ArrayList<>();
        comprasCliente1.add(new Compra("Leche", 3000, 2));
        comprasCliente1.add(new Compra("Pan", 2000, 3));
        Cliente cliente1 = new Cliente("Cliente 1", comprasCliente1);

        List<Compra> comprasCliente2 = new ArrayList<>();
        comprasCliente2.add(new Compra("Huevos", 300, 10));
        comprasCliente2.add(new Compra("Cereal", 4000, 1));
        comprasCliente2.add(new Compra("Gaseosa", 6000, 1));
        comprasCliente2.add(new Compra("Milo", 14000, 1));
        Cliente cliente2 = new Cliente("Cliente 2", comprasCliente2);

        List<Compra> comprasCliente3 = new ArrayList<>();
        comprasCliente3.add(new Compra("Panela", 5000, 2));
        comprasCliente3.add(new Compra("Galletas", 6000, 1));
        Cliente cliente3 = new Cliente("Cliente 3", comprasCliente3);
        
        List<Compra> comprasCliente4 = new ArrayList<>();
        comprasCliente4.add(new Compra("Carne", 15000, 1));
        comprasCliente4.add(new Compra("Sal", 3000, 2));
        Cliente cliente4 = new Cliente("Cliente 4", comprasCliente4);

        // Iniciar el proceso de cobro en hilos separados para cada cliente
        cajera1.start();
        cajera2.start();

        // Procesar compras de clientes
        cajera1.procesarCompra(cliente1, initialTime);
        cajera1.procesarCompra(cliente2, initialTime);
        cajera2.procesarCompra(cliente3, initialTime);
        cajera2.procesarCompra(cliente4, initialTime);

        //se toma el tiempo final
        long finalyTime = System.currentTimeMillis();
        
        //se muestra el tiempo total de la aplicacion, tiempo final - tiempo inicial
        System.out.println(" Tiempo total de la aplicacion es: "
                + ( finalyTime - initialTime) / 1000
                + " segundos ");
    }

}


