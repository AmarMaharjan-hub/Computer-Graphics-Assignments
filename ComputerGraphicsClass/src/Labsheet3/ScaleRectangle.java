/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//2.WAP in java to draw and scale rectangle.
package Labsheet3;
import java.applet.*;
import java.awt.*;

/**
 *
 * @author riku
 */
public class ScaleRectangle extends Applet{
    int x1=30,x2=100,y1=30,y2=30,y3=80,x3=100,x4=30,y4=80,sx=2,sy=2;
    public void paint(Graphics g){
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x4,y4);
        g.drawLine(x4,y4,x1,y1);
        g.drawLine(x1*sx,y1*sy,x2*sx,y2*sy);
        g.drawLine(x2*sx,y2*sy,x3*sx,y3*sy);
        g.drawLine(x3*sx,y3*sy,x4*sx,y4*sy);
        g.drawLine(x4*sx,y4*sy,x1*sx,y1*sy);
    }
}