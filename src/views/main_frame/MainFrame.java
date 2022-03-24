package views.main_frame;

import javax.swing.JFrame;

import controller.ControlAutomata;

import  java.awt.*;    

import java.awt.event.ActionListener; 

public class MainFrame extends JFrame{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CanvasFA canvas;
    private NorthPanel menuBarr;
	
    public MainFrame(ActionListener actionListener){
        this.canvas = new CanvasFA(300, 300, (ControlAutomata) actionListener);
        this.menuBarr = new NorthPanel(actionListener);
        this.setLayout(new BorderLayout()); 
        this.setSize(800,800);
        this.initComponents();
        this.setVisible(true);  
    }

    private void initComponents(){
        this.add(canvas, BorderLayout.CENTER);  
        this.add(menuBarr, BorderLayout.NORTH);
    }

    public void restartAutomaton(){
        canvas.restartAutomaton();
    }
}