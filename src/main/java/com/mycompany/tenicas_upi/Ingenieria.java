/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tenicas_upi;

import javax.swing.JOptionPane;

/**
 *
 * @author E7240
 */
public class Ingenieria {
    double parcial1, parcial2, examenFinal, promedio;
    
    public void Programacion(){
        parcial1= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el primer parcial: "));
        parcial2= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el segundo parcial: "));
        examenFinal= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el examen final: "));
        promedio= (parcial1+parcial2+examenFinal)/3;
        JOptionPane.showMessageDialog(null, "\t\tEl Promedio final del estudiante es: "+promedio%.2f);
        
        
    }
    public void Calculo(){
        parcial1= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el primer parcial: "));
        parcial2= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el segundo parcial: "));
        examenFinal= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el examen final: "));
        promedio= (parcial1+parcial2+examenFinal)/3;
        JOptionPane.showMessageDialog(null, "\t\tEl Promedio final del estudiante es: "+promedio%.2f);
    }
    public void Ingles(){
        parcial1= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el primer parcial: "));
        parcial2= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el segundo parcial: "));
        examenFinal= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el examen final: "));
        promedio= (parcial1+parcial2+examenFinal)/3;
        JOptionPane.showMessageDialog(null, "\t\tEl Promedio final del estudiante es: "+promedio%.2f);
    }
    public void Algebra(){
        parcial1= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el primer parcial: "));
        parcial2= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el segundo parcial: "));
        examenFinal= Double.parseDouble(JOptionPane.showInputDialog("\t\tDigite la nota obtenida en el examen final: "));
        promedio= (parcial1+parcial2+examenFinal)/3;
        JOptionPane.showMessageDialog(null, "\t\tEl Promedio final del estudiante es: "+promedio%.2f);
    }
    
    public static void main(String[] args) {
        Ingenieria notas = new Ingenieria();
        int menu;
         do{
             menu=Integer.parseInt(JOptionPane.showInputDialog("\t\tDigite el promedio de la nota que corresponda:"
                     + "\t\t\n1) Programacion"
                     + "\t\t\n2) Calculo"
                     + "\t\t\n3) Ingles"
                     + "\t\t\n4) Algebra"
                     + "\t\t\n0) Salir"));
             switch(menu){
                 case 1 : 
                     notas.Programacion();
                     break;
                     case 2 : 
                     notas.Calculo();
                     break;
                     case 3 : 
                     notas.Ingles();
                     break;
                     case 4 : 
                     notas.Algebra();
                     break;
             }
         }while(menu!=0);
    }
}
