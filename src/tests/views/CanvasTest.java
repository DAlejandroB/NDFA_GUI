package tests.views;

import javax.swing.JFrame;
import  java.awt.*;     

import views.main_frame.CanvasFA;
import views.main_frame.NorthPanel;

public class CanvasTest {
   
	public static void main(String[] args) {
		
		CanvasFA canvas = new CanvasFA(300,300);
        NorthPanel menuBarr = new NorthPanel();
        JFrame f = new JFrame("Paint Demo"); 
        f.setLayout(new BorderLayout()); 
        f.setSize(800,800);
        f.add(canvas, BorderLayout.CENTER);  
        f.add(menuBarr, BorderLayout.NORTH);
        //f.setLayout(null);  
        f.setVisible(true);  
	}
}
