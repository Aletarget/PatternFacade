
package practica_facade;

/**
 *
 * @author jorge malaver
 */

import Vista.Ventana;


import javax.swing.SwingUtilities;
public class Practica_facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run() {
          new Ventana();
        } 
      });
      // String nom;
        // try (Scanner sc = new Scanner(System.in)) {
        //   System.out.print("DIGITE NOMBRE .....");
        //   nom = sc.nextLine();
        // }
        // cliente obj = new cliente(nom);
        // obj.impre();
        // System.out.println( new FacadePrestamo().sinreporte(obj));
        
    }
    
   
    
}
