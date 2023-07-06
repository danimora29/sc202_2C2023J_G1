/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodaniela;

/**
 *
 * @author Mercedes León
 */
public class Cliente {
    private String nombre;
    private int telefono;
    private String cita;
    private String barbero;

    
    //CONSTRUCTRES
    public Cliente (String nombre, int telefono, String cita, String barbero) {
        this.nombre=nombre;
        this.telefono=telefono;
        this.cita=cita;
        this.barbero=barbero;
    }

    //getters y setters de clase cliente
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
    public int getTelefono(){
        return telefono;
    }

    public void setTelefono (int telefono){
        this.telefono=telefono;
    }
    
    public String getCita(){
        return cita;
    }

    public void setCita (String cita){
        this.cita= cita;
    }
    
    public String getBarbero(){
        return barbero;
    }

    public void setBarbero() {
        this.barbero= barbero;
    }

    void setBarbero(String barbero2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
