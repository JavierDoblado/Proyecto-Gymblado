/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionGym;
import CamaraDeVigilancia.CargaLaCamara;
import CamaraDeVigilancia.VentanaTemp;
import CamaraDeVigilancia.ViendoTuEntrenamiento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlaTusMusculos {

    private CargaLaCamara vistaCarga;
    private ViendoTuEntrenamiento vistaPrincipal;

    public ControlaTusMusculos(CargaLaCamara vistaCarga, ViendoTuEntrenamiento vistaPrincipal) {
        this.vistaCarga = vistaCarga;
        this.vistaPrincipal = vistaPrincipal;
    }


    
    
    public void iniciarAplicacion() {
        // Mostrar la ventana de carga
        vistaCarga.setVisible(true);

        // Iniciar el temporizador para cambiar a la ventana principal después de 3 segundos
        vistaCarga.startTimer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana de carga
                vistaCarga.dispose();
                
                // Mostrar la ventana principal
                vistaPrincipal.setVisible(true);
            }
        });
    }
}