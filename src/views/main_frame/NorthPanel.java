package views.main_frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Commands;

public class NorthPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton restartAutomaton, validateWord;

	public NorthPanel(ActionListener listener) {
		restartAutomaton = new JButton();
		validateWord = new JButton();
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setBackground(Color.LIGHT_GRAY);
		this.initComponents(listener);
		this.setVisible(true);
	}

	private void initComponents(ActionListener actionListener) {
		restartAutomaton.setText("Reiniciar");
		restartAutomaton.addActionListener(actionListener);
		restartAutomaton.setActionCommand(Commands.C_RESTART.toString());
		this.add(restartAutomaton);
		validateWord.addActionListener(actionListener);
		validateWord.setActionCommand(Commands.C_VALIDATE_WORD.toString());
		validateWord.setText("Ingresar palabra");
		this.add(validateWord);
	}

}
