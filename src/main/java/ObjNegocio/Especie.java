/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjNegocio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *Objeto de negocio que hace referencia a Especie
 * @author eruma
 */
public class Especie {
    
    private String nomCientifico, descripcion, nomEspanol;
    private ObjectId id;
    private ObjectId habitat;
    private Zona zona;

    /**
     * Constructor de la clase Especie que recibe todos los atributos
     * necesarios para inicializar un objeto Especie.
     * @param nomCientifico Nombre científico que recibe la especie
     * @param descripcion Descripcion de la especie
     * @param nomEspanol Nombre en espaniol de la especie
     * @param id Identificador que tiene la especie
     * @param habitat Habitat en donde vive la especie
     * @param zona Zona en donde se encuentra la especie en el zoologico
     */
    public Especie(String nomCientifico, String descripcion, String nomEspanol, ObjectId id, ObjectId habitat, Zona zona) {
        this.nomCientifico = nomCientifico;
        this.descripcion = descripcion;
        this.nomEspanol = nomEspanol;
        this.id = id;
        this.habitat = habitat;
        this.zona = zona;
    }

    public Especie() {
    }
    
    
    
    /**
     * Método que obtiene el habitat de la especie
     * @return habitat de la especie
     */
    public ObjectId getHabitat() {
        return habitat;
    }

    /**
     * Método que asigna un habitat a la especie
     * @param habitat Habitat en donde vive la especie
     */
    public void setHabitat(ObjectId habitat) {
        this.habitat = habitat;
    }

    /**
     * Método que obtiene la zona donde se encuentra la especie
     * @return zona donde se encuentra la especie
     */
    public Zona getZona() {
        return zona;
    }

    /**
     * Método que asigna una zona a la especie
     * @param zona Zona en donde se encuentra la especie en el zoologico
     */
    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    /**
     * Método que obtiene el nombre cientifico de la especie
     * @return nombre cientifico que recibe la especie
     */
    public String getNomCientifico() {
        return nomCientifico;
    }

    /**
     * Método que asigna el nombre científico de la especie
     * @param nomCientifico Nombre científico que recibe la especie
     */
    public void setNomCientifico(String nomCientifico) {
        this.nomCientifico = nomCientifico;
    }

    /**
     * Método que obtiene la descripcion de la especie
     * @return descripcion de la especie
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que asigna una descripción a la especie
     * @param descripcion Descripcion de la especie
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que obtiene el nombre en espaniol de la especie
     * @return nombre en espaniol de la especie
     */
    public String getNomEspanol() {
        return nomEspanol;
    }

    /**
     * Método que asigna un nombre en espaniol a una especie
     * @param nomEspanol Nombre en espaniol de la especie
     */
    public void setNomEspanol(String nomEspanol) {
        this.nomEspanol = nomEspanol;
    }

    /**
     * Método que obtiene el identificador de la especie
     * @return identificador de especie
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que asigna un identificador a la especie
     * @param id Identificador que tiene la especie
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Calcula y devuelve el valor hash de la especie
     * @return valor hash del objeto Especie
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara el objeto Especie con otro objeto para saber si son iguales
     * @param objel objeto a comparar
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
        final Especie other = (Especie) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Devuelve una representación en cadena de los atributos del objeto
     * @return una cadena de texto donde se encuentren todos los atributos que conformen a la especie 
     */
    @Override
    public String toString() {
        return "Especie{" + "nomCientifico=" + nomCientifico + ", descripcion=" + descripcion + ", nomEspanol=" + nomEspanol + ", id=" + id + ", habitat=" + habitat + '}';
    }
    
    
}
