/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjNegocio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Objeto de negocio que hace referencia a Zona
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
     * Constructor de la clase Zona que recibe todos los atributos
     * necesarios para inicializar un objeto Zona.
     * @param extension longitud en metros de la zona
     * @param nombre nombre de la zona en cuestion
     */
    public Zona(float extension, String nombre) {
        this.extension = extension;
        this.nombre = nombre;
    }
    /**
     * Constructor por omision
     */
    public Zona() {
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
     * Método que obtiene el nombre de la zona
     * @return nombre de la zona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna un nombre a la zona
     * @param nombre nombre que recibira la zona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el identificador de la zona
     * @return Identificador que tiene la zona
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que asigna un identificador a una zona
     * @param id identificador de zona
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Calcula y devuelve el valor hash de la zona
     * @return valor hash del objeto Zona
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara el objeto Zona con otro objeto para saber si son iguales
     * @param obj objeto a comparar
     * @return true si los objetos son iguales, false en caso contrario.
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
