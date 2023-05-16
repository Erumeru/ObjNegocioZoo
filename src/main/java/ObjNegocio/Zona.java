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

    public Zona(float longitud, String nombre, ObjectId id) {
        this.longitud = longitud;
        this.nombre = nombre;
        this.id = id;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
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
