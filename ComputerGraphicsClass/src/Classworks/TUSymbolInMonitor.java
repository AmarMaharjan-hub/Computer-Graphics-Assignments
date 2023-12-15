/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classworks;
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author riku
 */
public class TUSymbolInMonitor extends Canvas{
    public static void main(String[] args) {
        TUSymbolInMonitor t1=new TUSymbolInMonitor();
        JFrame f=new JFrame();
        f.add(t1);
        f.setSize(600,600);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        g.fillRect(50,80,250,200);
        g.fillOval(125,280,100,30);
        g.setColor(Color.BLUE);
        g.fillRect(55,85,240,190);
        g.setColor(Color.WHITE);
        g.drawLine(80,220,170,100);
        g.drawLine(170,100,260,220);
        g.drawLine(80,220,260,220);
        
        g.drawLine(80,140,170,260);
        g.drawLine(80,140,260,140);
        g.drawLine(260,140,170,260);
        
        g.drawString("TU",165,180);
        //g.drawString(str, WIDTH, WIDTH);
    }
}
