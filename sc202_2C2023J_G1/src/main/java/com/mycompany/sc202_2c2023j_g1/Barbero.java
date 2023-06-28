
package com.mycompany.sc202_2c2023j_g1;


public class Barbero {
    private String nombre;
    private int horaAlmuerzo;

    public Barbero(String nombre, int horaAlmuerzo) {
        this.nombre = nombre;
        this.horaAlmuerzo = horaAlmuerzo;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getHoraAlmuerzo(){
        return horaAlmuerzo;
    }
    
    public void setHoraAlmuerzo(int horaAlmuerzo){
        this.horaAlmuerzo = horaAlmuerzo;
    }
 

    
}
