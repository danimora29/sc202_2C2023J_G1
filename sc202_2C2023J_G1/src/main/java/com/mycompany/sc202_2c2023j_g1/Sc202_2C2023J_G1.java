/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sc202_2c2023j_g1;

/**
 *
 * @author Usuario
 */
public class Sc202_2C2023J_G1 {

    public static void main(String[] args) {
        Barbero barbero1 = new Barbero("Mario", 1);
        Barbero barbero2 = new Barbero("Luis",2);
        
        System.out.println("Barbero1: " + barbero1.getnombre() +" Hora de Almuerzo: " + barbero1.getHoraAlmuerzo());
        System.out.println("Barbero1: " + barbero2.getnombre() +" Hora de Almuerzo: " + barbero2.getHoraAlmuerzo());
        
        
       //Modifica la hora de almuerzo del barbero1
       barbero1.setHoraAlmuerzo(12);
       System.out.println("Nueva hora de almuerzo del barbero1: " + barbero1.getHoraAlmuerzo());
        
        
    }
}
