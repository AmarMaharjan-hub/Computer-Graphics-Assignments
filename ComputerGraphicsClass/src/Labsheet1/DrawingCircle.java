/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Draw a circle with radius 50
package Labsheet1;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author riku
 */
public class DrawingCircle extends Applet{
    public void paint(Graphics g){
        g.drawOval(60,40,50,50);
    }
}
