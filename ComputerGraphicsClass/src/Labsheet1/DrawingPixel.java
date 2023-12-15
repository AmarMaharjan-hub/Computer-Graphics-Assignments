/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Draw a pixel in java
package Labsheet1;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author riku
 */
public class DrawingPixel extends Applet{
    public void paint(Graphics g){
        g.drawString(".",50,20);
    }
}
