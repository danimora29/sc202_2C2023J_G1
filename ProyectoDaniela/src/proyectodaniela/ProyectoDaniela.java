/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectodaniela;

/**
 *
 * @author Mercedes León
 */
public class ProyectoDaniela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cliente cliente1= new Cliente ("Juan", 123454566, "2023-07-01", "Barbero1");
    System.out.println("Nombre de cliente: " + cliente1.getNombre());
    System.out.println("Teléfono del cliente: " +cliente1.getTelefono());
    System.out.println("Cita del cliente: " +cliente1.getCita());
    System.out.println("Barbero del cliente: " + cliente1.getBarbero());

//Para modficar el barbero
    cliente1.setBarbero("Barbero2");
    System.out.println("Nuevo barbero :" + cliente1.getBarbero());
}
}