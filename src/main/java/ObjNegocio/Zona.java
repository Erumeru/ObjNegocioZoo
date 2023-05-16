/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjNegocio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author eruma
 */
public class Zona {
    
    private float extension;
    private String nombre;
    private ObjectId id;

    /**
     * Constructor de la clase Zona que recibe todos los atributos
     * necesarios para inicializar un objeto Zona.
     * @param extension longitud en metros de la zona
     * @param nombre nombre de la zona en cuestion
     * @param id Identificador que tiene la zona
     */
    public Zona(float extension, String nombre, ObjectId id) {
        this.extension = extension;
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Método que obtiene la extension en metros de la zona 
     * @return extension de la zona
     */
    public float getExtension() {
        return extension;
    }

    /**
     * Método que asigna la extension de la zona
     * @param extension longitud en metros de la zona
     */
    public void setExtension(float extension) {
        this.extension = extension;
    }

    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return 
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Método 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zona other = (Zona) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
