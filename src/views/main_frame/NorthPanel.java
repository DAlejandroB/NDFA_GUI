package views.main_frame;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;  

public class NorthPanel extends JPanel{
    
    private JButton restartAutomaton, validateWord;

    public NorthPanel(){
        restartAutomaton = new JButton();
        validateWord = new JButton();
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBackground(Color.LIGHT_GRAY);
        this.initComponents();
        this.setVisible(true);
    }

    private void initComponents(){
        restartAutomaton.setText("Reiniciar");
        this.add(restartAutomaton);
        validateWord.setText("Ingresar palabra");
        this.add(validateWord);
    }

}
