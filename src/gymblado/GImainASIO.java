/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gymblado;
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
          ViendoTuEntrenamiento TeVigilo = new ViendoTuEntrenamiento();
        
        // Crear la instancia del modelo
        ModelaTuCuerpo esculpete = new ModelaTuCuerpo();
        
        // Crear la instancia del controlador y pasarle el modelo y la vista
        ControlaTusMusculos controlador = new ControlaTusMusculos(esculpete, TeVigilo);
        
        // Mostrar la vista
        TeVigilo.setVisible(true);
    }
}