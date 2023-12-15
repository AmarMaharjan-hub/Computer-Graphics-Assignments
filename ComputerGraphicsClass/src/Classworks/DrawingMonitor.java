import java.awt.*;  
import javax.swing.JFrame;  
  
public class DrawingMonitor extends Canvas{  
      
    public void paint(Graphics g) {  
        setBackground(Color.white); 
        setForeground(Color.black);   
        g.drawString("Computer Graphics",50,50);  
		
        g.fillRect(50, 80,250,200);
          
        g.fillOval(125,280,100, 30);
	g.setColor(Color.blue);
        g.fillRect(55,85,240,190); 
        
    }  
        public static void main(String[] args) {  
        DrawingMonitor m = new DrawingMonitor();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
}
