package Vista;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Inputs extends JPanel {
    private JLabel textHelp;
    private JTextField textNom;
    public Inputs(){
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        textHelp = new JLabel("Ingrese su nombre:  ");
        textNom = new JTextField();
        textNom.setMaximumSize(new Dimension(150,20));
        add(textHelp);
        add(textNom);
    }
    public String nombre(){
        return textNom.getText();
    }
}
