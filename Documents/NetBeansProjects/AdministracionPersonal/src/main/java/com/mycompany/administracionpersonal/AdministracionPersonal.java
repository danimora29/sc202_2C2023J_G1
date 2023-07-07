
package com.mycompany.administracionpersonal;

import javax.swing.JOptionPane;

public class AdministracionPersonal {

    public static void main(String[] args){
        
        String nombreBarbero = JOptionPane.showInputDialog("Ingrese el nombre del barbero:");
        String horaAlmuerzo = JOptionPane.showInputDialog("Ingrese la hora de almuerzo del barbero:");

        JOptionPane.showMessageDialog(null, "El barbero " + nombreBarbero + " tiene su hora de almuerzo a las " + horaAlmuerzo);
    }
}

