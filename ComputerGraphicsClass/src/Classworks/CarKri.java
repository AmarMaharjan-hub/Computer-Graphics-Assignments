/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Draw a car or truck and add your name signature inside it.
package Classworks;
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author riku
 */
public class CarKri extends Canvas{
    public static void main(String[] args) {
        CarKri c1=new CarKri();
        JFrame f=new JFrame();
        f.add(c1);
        f.setSize(600,600);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        g.fillRect(50,350,500,100);
        g.fillRect(200,270,200,100);
        g.fillOval(120,400,100,100);
        g.fillOval(380,400,100,100);
        g.setColor(Color.WHITE);
        g.fillRect(55,355,490,90);
        g.fillRect(205,275,190,77);
        g.setColor(Color.BLACK);
        
        g.drawLine(200,430,200,380);
        g.drawLine(200,405,220,430);
        g.drawLine(200,405,220,380);
        
        g.drawLine(240,430,240,380);
        g.drawLine(240,405,260,430);
        g.drawLine(240,405,260,380);
        
        g.drawLine(300,270,300,353);
        
    }
}
