/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sc202_2c2023j_g1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Calendario {
    
    Date fechaActual = new Date();
    
    SimpleDateFormat formaFecha = new SimpleDateFormat("EEEE dd-MM-yyyy");
    
    public String dia;
    
    public String mes;
    
    public int hora;
    
    public int iSabado;
    
    public int iDomingo;
    
    public String fecha = formaFecha.format(fechaActual);

    public String GuardarCitaMes(){
        
        mes = JOptionPane.showInputDialog("Ingrese el mes, que desea reservar");
        
        return (mes);
        
    }
    
    public String GuardarCitaDia(){
        
        dia = JOptionPane.showInputDialog("Ingrese el dia, que desea reservar");
        
        return (dia);
        
    }
    
    public int GuardarCitaHora(){
        
        hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el hora, que desea reservar"));
        
        return (hora);
        
    }
    
    public String Unir(String dia, String mes){
        
        return 2023+"-"+mes+"-"+dia;
        
    }
    
    public void FinSemana(String NDia){
        
        if (NDia == "Sabado" || NDia == "Domingo") {
            
            System.out.println("Fin de semana");
            
        }else{
            
            System.out.println("No es fin de semana");
            
        }
         
    }
    
    public String getDiaSemana(String fecha) {
        
        String Valor_dia = null;
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        Date fechaActual2 = null;
        
        try {
            
            fechaActual2 = df.parse(fecha);
            
        } catch (ParseException e) {
            
            System.err.println("No se ha podido parsear la fecha.");
            
            e.printStackTrace();
            
        }
        GregorianCalendar fechaCalendario = new GregorianCalendar();
        
        fechaCalendario.setTime(fechaActual2);
        
        int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
        
        switch (diaSemana) {
            
            case 1 -> Valor_dia = "Domingo";
            
            case 2 -> Valor_dia = "Lunes";
            
            case 3 -> Valor_dia = "Martes";
            
            case 4 -> Valor_dia = "Miercoles";
            
            case 5 -> Valor_dia = "Jueves";
            
            case 6 -> Valor_dia = "Viernes";
            
            case 7 -> Valor_dia = "Sabado";
            
            default -> {
                
            }
            
        }
        
        System.out.println(Valor_dia);
        
        return Valor_dia;
        
    }
    
}
