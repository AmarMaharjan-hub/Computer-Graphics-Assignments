/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classworks;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author riku
 */
public class ShearInGraph extends Canvas{
    public void paint(Graphics g){
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
        g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
        int yc=getHeight()/2;
        int xc=getWidth()/2;
        int[] xo={20,60,40};
        int[] yo={10,10,40};
        int[] x1={0,0,0};
        int[] y1={0,0,0};
        int[] xp={0,0,0};
        int[] yp={0,0,0};
        double shx=3,shy=1.5;
        for(int i=0;i<3;i++){
            x1[i]=(int)(xo[i]+shx*yo[i]);
            y1[i]=yo[i];
        }
        for(int i=0;i<3;i++){
            x1[i]=xc+x1[i];
            y1[i]=yc-y1[i];
            xp[i]=xc+xo[i];
            yp[i]=yc-yo[i];
        }
        g.drawPolygon(xp,yp,3);
        g.setColor(Color.RED);
        g.drawPolygon(x1,y1,3);
        for(int i=0;i<3;i++){
            x1[i]=xo[i];
            y1[i]=(int)(shy*xo[i]+yo[i]);
        }
        for(int i=0;i<3;i++){
            x1[i]=xc+x1[i];
            y1[i]=yc-y1[i];
        }
        g.setColor(Color.BLUE);
        g.drawPolygon(x1,y1,3);
        for(int i=0;i<3;i++){
            x1[i]=(int)(xo[i]+yo[i]*shx);
            y1[i]=(int)(yo[i]+xo[i]*shy);
        }
        for(int i=0;i<3;i++){
            x1[i]=xc+x1[i];
            y1[i]=yc-y1[i];
        }
        g.setColor(Color.GREEN);
        g.drawPolygon(x1,y1,3);
    }
    public static void main(String args[]){
        ShearInGraph sig=new ShearInGraph();
        JFrame f=new JFrame();
        f.setSize(500,500);
        f.add(sig);
        f.setVisible(true);
    }
}
