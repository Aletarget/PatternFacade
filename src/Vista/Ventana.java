package Vista;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Cliente.cliente;
import Facade.FacadePrestamo;
import Modulos.EntidadBancaria;
import Modulos.Estudiocredito;
import Modulos.Solicitudprestamo;

public class Ventana extends JFrame {
    private JPanel main;
    private Header header;
    private Inputs inputs;
    private Result results;
    private JButton btnConfirm; 
    public Ventana(){
        setTitle("SISTEMA DE PRESTAMOS");
        setSize(400, 400);
        
        setLayout(new BorderLayout());
        header = new Header();
        inputs = new Inputs();
        results = new Result();
        btnConfirm = new JButton("Pedir prestamo");
        main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.add(inputs);
        main.add(Box.createVerticalStrut(10));
        main.add(btnConfirm);
        main.add(Box.createVerticalStrut(10));
        main.add(results);
        inputs.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnConfirm.setAlignmentX(Component.CENTER_ALIGNMENT);
        results.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        add(header, BorderLayout.NORTH);
        add(main, BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btnConfirm.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = inputs.nombre();
                if (nom.equals("")) {
                    JOptionPane.showMessageDialog(null, "No se ha ingresado ningun nombre, intentelo de nuevo.");
                }else{

                    cliente obj = new cliente(nom);
                    String result = "<html>"+obj.impre() +"<br>"+new EntidadBancaria().Fondos()+"<br>"+ new Estudiocredito().historial() +"<br>"+ new Solicitudprestamo().posee()+"<br>"+ new FacadePrestamo().sinreporte(obj)+ "</html>";
                    results.showResults(result);
                }
            }
            
        });
    }
}
