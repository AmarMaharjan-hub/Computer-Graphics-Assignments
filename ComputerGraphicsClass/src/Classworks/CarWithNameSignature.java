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
public class CarWithNameSignature extends Canvas{
    public static void main(String[] args) {
        CarWithNameSignature c1=new CarWithNameSignature();
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
        
        g.drawLine(200,430,220,380);
        g.drawLine(220,380,240,430);
        g.drawLine(230, 405, 210, 405);
        
        g.drawLine(260, 430, 260, 380);
        g.drawLine(260,380,280,430);
        g.drawLine(280,430,300,380);
        g.drawLine(300,380, 300, 430);
        
        g.drawLine(320,430,340,380);
        g.drawLine(340,380,360,430);
        g.drawLine(330,405,350,405);
        
        g.drawLine(380,430,380,380);
        g.drawLine(380,380,400,430);
        g.drawLine(400,430,420,380);
        g.drawLine(420,380,420,430);
        
        g.drawLine(300,270,300,353);
        
    }
}
