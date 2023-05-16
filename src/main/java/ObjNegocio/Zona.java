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
public class Zona {
    
    private float extension;
    private String nombre;
    private ObjectId id;

    public Zona(float extension, String nombre, ObjectId id) {
        this.extension = extension;
        this.nombre = nombre;
        this.id = id;
    }

    public float getExtension() {
        return extension;
    }

    public void setExtension(float extension) {
        this.extension = extension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
}
