package Classworks;
import java.awt.*;  
import javax.swing.JFrame;  
  
public class Rotation_in_Graph extends Canvas{  
    
 
    public void paint(Graphics g) {  
        setBackground(Color.white); 
        setForeground(Color.black);   
 	//draw x-axis
 	g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
 	// draw y-axis
 	g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
 	// find center of the graph
 	int xc=getWidth()/2,yc=getHeight()/2;
 	//co-ordinates of the triangle
 	int [] x= {10,100,55};
 	int [] y= {10,10,100};
	int [] x_= {0,0,0};
 	int [] y_= {0,0,0};
 	int [] xr= {0,0,0};
 	int [] yr= {0,0,0};
	//display co-ordinates to graph co-ordiate
     	for (int i=0;i<3;i++){
            x_[i]= xc + x[i];
            y_[i]= yc - y[i];
     	}
     	//drawing the triangle
        g.drawPolygon(x_,y_,3);
	//Rotation angle in degree
	int theta_d=90;
	double theta_r=Math.toRadians(theta_d);
	
        for (int i=0;i<3;i++){
            xr[i]= (int)( x[i] * Math.cos(theta_r) - y[i] * Math.sin(theta_r));
            yr[i]= (int)(x[i] * Math.sin(theta_r) + y[i] * Math.cos(theta_r));
     	}
	//display co-ordinates to graph co-ordiate
     	for (int i=0;i<3;i++){
            x_[i]= xc + xr[i];
            y_[i]= yc - yr[i];
     	}

        g.setColor(Color.red);
        g.drawPolygon(x_,y_,3);

    }
    public static void main(String[] args) {
       Rotation_in_Graph rg=new Rotation_in_Graph();
       JFrame f=new JFrame();
       f.setSize(400,400);       
       f.setLocationRelativeTo(null);
       f.add(rg);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
        