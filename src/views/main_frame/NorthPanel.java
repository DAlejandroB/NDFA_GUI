package views.main_frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;  

public class NorthPanel extends JPanel{

	private JButton restartAutomaton, validateWord;

	public NorthPanel(ActionListener listener){
		restartAutomaton = new JButton();
		validateWord = new JButton();
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setBackground(Color.LIGHT_GRAY);
		this.initComponents(listener);
		this.setVisible(true);
	}

	private void initComponents(ActionListener listener){
		restartAutomaton.setText("Reiniciar");
		restartAutomaton.addActionListener(listener);
		restartAutomaton.setActionCommand("Reiniciar");
		this.add(restartAutomaton);
		validateWord.setText("Ingresar palabra");
		validateWord.addActionListener(listener);
		validateWord.setActionCommand("Palabra");
		this.add(validateWord);
	}

}
