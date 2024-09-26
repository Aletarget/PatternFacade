package Vista;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header extends JPanel{
    private JLabel titulo;
    private JLabel img;
    private ImageIcon image;
    public Header(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        titulo = new JLabel("Bienvenido a nuestro sistema bancario");
        image = new ImageIcon(getClass().getResource("./Images/Bank.png"));
        img = new JLabel(image);

        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        img.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(titulo);
        add(img);
    }
}
