/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classworks;
import java.awt.*;
import javax.swing.*;
import java.lang.Math;
/**
 *
 * @author riku
 */
public class PolygonScalingInGraph extends Canvas{
    public void paint(Graphics g){
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
        g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
        
        int xc=getWidth()/2,yc=getHeight()/2;
        int[] x={-75,-37,-10};
        int[] y={10,10,110};
        int[] x1={0,0,0};
        int[] y1={0,0,0};
        int[] x2={0,0,0};
        int[] y2={0,0,0};
        int[] xo={-75,-37,-10};
        int[] yo={10,10,110};
        for(int i=0;i<3;i++){
            x1[i]=xc+x[i];
            y1[i]=yc-y[i];
        }

        g.drawPolygon(x1,y1,3);
        float sx=1.5f,sy=1.5f;
        for(int i=0;i<3;i++){
            x[i]=(int)(x[i]*sx);
            y[i]=(int)(y[i]*sy);
        }
        for(int i=0;i<3;i++){
            x1[i]=xc+x[i];
            y1[i]=yc-y[i];
        }
        g.setColor(Color.RED);
        g.drawPolygon(x1,y1,3);
        
        int thi=-90;
        double rad=Math.toRadians(thi);
        double sin1=Math.sin(rad),cos1=Math.cos(rad);
//computer ma thita lai radian ma garinxa
        for(int i=0;i<3;i++){
            x2[i]=(int)(xo[i]*cos1-yo[i]*sin1);
            y2[i]=(int)(xo[i]*sin1+yo[i]*cos1);
        }
        System.out.println("hello");
        for(int i=0;i<3;i++){
            x2[i]=xc+x2[i];
            y2[i]=yc-y2[i];
        }
        g.setColor(Color.BLUE);
        g.drawPolygon(x2,y2,3);
    }
    public static void main(String[] args) {
        PolygonScalingInGraph ps=new PolygonScalingInGraph();
        JFrame f=new JFrame();
        f.setSize(600,600);
        f.add(ps);
        f.setVisible(true);
    }
}
