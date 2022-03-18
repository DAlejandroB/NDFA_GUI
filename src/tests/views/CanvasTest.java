package tests.views;

import javax.swing.JFrame;

import views.main_frame.CanvasFA;

public class CanvasTest {
	public static void main(String[] args) {
		
		CanvasFA canvas = new CanvasFA(300,300);
        JFrame f = new JFrame("Paint Demo");  
        f.setSize(800,800);
        f.add(canvas);  
        //f.setLayout(null);  
        f.setVisible(true);  
	}
}
