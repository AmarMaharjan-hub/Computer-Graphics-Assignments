/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//1)Implement Bersenham's Line Drawing Algorithm  to draw a line having end point (20,10) and (30,18).
package Labsheet2;
import java.applet.*;
import java.awt.Graphics;
import static java.lang.Math.abs;
/**
 *
 * @author riku
 */
public class CircleWithBersenhamAlgo extends Applet{
    public void paint(Graphics g){
        int x1=20,y1=10,x2=30,y2=18,dx,dy,m,x,y,p;
        dx=abs(x2-x1);
        dy=abs(y2-y1);
        m=abs(dy/dx);
        p=2*dy-dx;
        x=x1;
        y=y1;
        g.drawString(".",x,y);
        for(int i=0;i<dx;i++){
            if(p<0){
                y=y;
                p=p+2*dy;
            }else{
                y=y+1;
                p=p+2*dy-2*dx;
            }
            x=x+1;
            g.drawString(".",x,y);
        }

    }
}
