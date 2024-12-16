/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gymodelo;

/**
 *
 * @author Javier
 */
public class ModelaTuCuerpo {
    private String nombre;
    private String descripcion;
    private String zonaCuerpo; // Ejemplo: "Pecho", "Espalda", etc.
    private boolean enCasa; // True si se puede hacer en casa, false si requiere equipo de gimnasio

    public ModelaTuCuerpo() {
    }

    public ModelaTuCuerpo(String nombre, String descripcion, String zonaCuerpo, boolean enCasa) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.zonaCuerpo = zonaCuerpo;
        this.enCasa = enCasa;
    }
//
    public String getNombre() {
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getDescripcion() {
        return descripcion; 
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getZonaCuerpo() { 
        return zonaCuerpo;
    }
    
    public void setZonaCuerpo(String zonaCuerpo) { 
        this.zonaCuerpo = zonaCuerpo;
    }

    public boolean isEnCasa() { 
        return enCasa;
    }
    
    public void setEnCasa(boolean enCasa) { 
        this.enCasa = enCasa; 
    }
}

