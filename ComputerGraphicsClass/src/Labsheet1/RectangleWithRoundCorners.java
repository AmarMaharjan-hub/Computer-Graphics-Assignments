/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//2)Draw a rectangle with rounded corners, width 100 and height 50 with the upper left corner.
package Labsheet1;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author riku
 */
public class RectangleWithRoundCorners extends Applet{
    public void paint(Graphics g){
        g.drawRoundRect(10,10,100,60,10,10);
    }
}
