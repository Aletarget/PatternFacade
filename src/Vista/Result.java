package Vista;


import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Result extends JPanel{
    private JLabel result;
    public Result(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(250, 250);
        this.result = new JLabel("");
        add(result);
    }
    public void showResults(String result){
        
        this.result.setText(result);  // Actualizar el texto del JLabel
        this.revalidate();  // Revalidar el layout del panel para refrescar
        this.repaint();     // Repintar el panel para actualizar la vista
    }
}
