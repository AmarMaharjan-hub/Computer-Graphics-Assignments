/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Draw an oval with width 50 and height 100.
package Labsheet1;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author riku
 */
public class DrawOval extends Applet{
    public void paint(Graphics g){
        g.drawOval(10, 10, 50, 10);
    }
}
