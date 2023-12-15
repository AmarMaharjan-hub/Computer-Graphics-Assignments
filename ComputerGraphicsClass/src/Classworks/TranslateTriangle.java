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
public class TranslateTriangle extends Canvas{
    int x1=150,y1=50,x2=200,y2=150,x3=50,y3=180;
    public static void main(String[] args) {
        TranslateTriangle tt1=new TranslateTriangle();
        JFrame f=new JFrame();
        f.add(tt1);
        f.setSize(600,600);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);

        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);
        g.setColor(Color.RED);
        translate();
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);
    }
    public void translate(){
        int tx=160,ty=65;
        x1+=tx;
        x2+=tx;
        x3+=tx;
        y1+=ty;
        y2+=ty;
        y3+=ty;
    }
}
