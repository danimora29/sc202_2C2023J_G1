/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoservicios;

/**
 *
 * @author Familia
 */
public class ProyectoServicios {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        double precioSemana = 2500;
        double precioFinDeSemana = 3000;

        ServiciosBarberia precioHoraSemana = new ServiciosBarberia(precioSemana);
        ServiciosBarberia precioHoraFinDeSemana = new ServiciosBarberia(precioFinDeSemana);

        double precioConIVASemana = precioHoraSemana.getPrecioConIVA();
        double precioConIVAFinDeSemana = precioHoraFinDeSemana.getPrecioConIVA();

        System.out.println("Precio por hora durante la semana: " + precioSemana);
        System.out.println("Precio total con IVA durante la semana: " + precioConIVASemana);

        System.out.println("\nPrecio por hora durante el fin de semana: " + precioFinDeSemana);
        System.out.println("Precio total con IVA durante el fin de semana: " + precioConIVAFinDeSemana);
    }
}
    

