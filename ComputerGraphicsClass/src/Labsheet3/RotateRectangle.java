/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//3. WAP in java to draw and rotate a rectangle
package Labsheet3;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author riku
 */
public class RotateRectangle extends Applet{
    int x1=30,y1=30,x2=100,y2=30,x3=100,y3=80,x4=30,y4=80,angle=10;
    public void paint(Graphics g){
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x4,y4);
        g.drawLine(x4,y4,x1,y1);
        double ra=(Math.PI/180)*angle;
        int co=(int)Math.cos(ra),si=(int)Math.sin(ra);
        x1=x1*co-y1*si;
        y1=x1*si+y1*co;
        x2=x2*co-y2*si;
        y2=x2*si+y2*co;
        x3=x3*co-y3*si;
        y3=x3*si+y3*co;
        x4=x4*co-y4*si;
        y4=x4*si+y4*co;
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x4,y4);
        g.drawLine(x4,y4,x1,y1);
    }
}
