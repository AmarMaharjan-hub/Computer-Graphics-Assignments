/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//3) Draw a horizontal,vertical,positive slope and negative slope line.
package Labsheet1;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author riku
 */
public class LineSlopes extends Applet{
    public void paint(Graphics g){
        g.drawLine(10,10,50,10);
        g.drawLine(10,10,10,50);
        g.drawLine(80,10,10,80);
        g.drawLine(70,20,120,60);
    }
}
