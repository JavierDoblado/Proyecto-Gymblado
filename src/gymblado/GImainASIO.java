/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gymblado;
import CamaraDeVigilancia.CargaLaCamara;
import Gymodelo.ModelaTuCuerpo;
import CamaraDeVigilancia.ViendoTuEntrenamiento;
import GestionGym.ControlaTusMusculos;


/**
 *
 * @author Javier
 */
public class GImainASIO {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
//         
        // Crear las vistas
        CargaLaCamara vistaCarga = new CargaLaCamara();
        ViendoTuEntrenamiento vistaPrincipal = new ViendoTuEntrenamiento();

        // Crear el controlador y pasarle las vistas
        ControlaTusMusculos controlador = new ControlaTusMusculos (vistaCarga, vistaPrincipal);

        // Iniciar la aplicación
        controlador.iniciarAplicacion();
    }
    
}
//