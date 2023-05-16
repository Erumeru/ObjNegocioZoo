/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjNegocio;

import org.bson.types.ObjectId;

/**
 *
 * @author eruma
 */
public class Habitat {
    private String nombre, clima, vegetacion, continentes[];
    private ObjectId id;

    public Habitat(String nombre, String clima, String vegetacion, String[] continentes, ObjectId id) {
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continentes = continentes;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }

    public String[] getContinentes() {
        return continentes;
    }

    public void setContinentes(String[] continentes) {
        this.continentes = continentes;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
}
