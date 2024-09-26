
package Facade;

/**
 *
 * @author jorge malaver
 */
import Modulos.*;
import Cliente.*;
public class FacadePrestamo {
 
    public String sinreporte(cliente x){
        
        if(new EntidadBancaria().Tienefondos(x) && (new Estudiocredito().historialcredito(x)) && new Solicitudprestamo().poseeprestamo(x)){
            
          return("Se le otorgo el prestamo");
    }
        else{
            
            return("No Se le otorgo el prestamo");
        }
    
}}
