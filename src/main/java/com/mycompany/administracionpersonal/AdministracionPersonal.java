
package com.mycompany.administracionpersonal;

import javax.swing.JOptionPane;


public class AdministracionPersonal {
    

    public static void main(String[] args){
        
        Barbero barbero = new Barbero("Juan");
         String horaAlmuerzo = JOptionPane.showInputDialog("Ingrese la hora de almuerzo del barbero " + barbero.getNombre() + ":");
        barbero.setHoraAlmuerzo(horaAlmuerzo);
         JOptionPane.showMessageDialog(null, "Hora de almuerzo registrada correctamente:\n" +
                "Barbero: " + barbero.getNombre() + "\n" +
                "Hora de almuerzo: " + barbero.getHoraAlmuerzo());
    }
}

