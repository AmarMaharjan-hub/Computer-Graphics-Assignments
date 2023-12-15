/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//1)WAP to change the color of the Font and its color
package Labsheet1;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author riku
 */
public class FontAndItsColor extends Applet{
    public void init(){
        setForeground(Color.red);
        Font f=new Font("Arial",Font.BOLD,18);
        setFont(f);    
    }
    public void paint(Graphics g){
        g.drawString("Hello World",20,20);
    }
}
