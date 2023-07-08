
package com.mycompany.administracionpersonal;


public class Barbero {
    
    private String nombre;
    private String horaAlmuerzo;
     public Barbero(String nombre) {
        this.nombre = nombre;
        this.horaAlmuerzo = "";
    }
     public void setHoraAlmuerzo(String horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }

     public String getNombre() {
        return nombre;
    }

     public String getHoraAlmuerzo() {
        return horaAlmuerzo;
    }
}




