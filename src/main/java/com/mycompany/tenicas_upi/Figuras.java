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
public class Figuras {
    public void cuadrado(){
 
        int lado, area;
        lado= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del lado de un cuadrado: "));
        area=lado*lado;
        JOptionPane.showMessageDialog(null, "El area de un cuadrado es: "+area);
        
    }
    public void triangulo(){
        int base, altura, area;
        base= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la base de un triangulo: "));
        altura= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la altura de un triangulo: "));
        area= (base*altura)/2;
        JOptionPane.showMessageDialog(null, "El area de un triaungulo es: "+area);


    }
    public void circulo(){
        double pi= 3.1416, radio, area;
        radio= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del radio de un circulo: "));
        area= radio*radio*pi;
        JOptionPane.showMessageDialog(null, "El area de un circulo es: "+area);
        
    }
}
