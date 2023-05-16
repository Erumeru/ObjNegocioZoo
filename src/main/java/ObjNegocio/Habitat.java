/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjNegocio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Objeto de negocio que hace referencia a Habitat
 * @author eruma
 */
public class Habitat {
    private String nombre, clima, vegetacion;
    private List<String> continentes;
    private ObjectId id;

    /**
     * Constructor de la clase Habitat que recibe todos los atributos
     * necesarios para inicializar un objeto Habitat.
     * @param nombre nombre que tiene el habitat
     * @param clima clima que presenta este habitat
     * @param vegetacion vegetación que presenta este habitat
     * @param continentes lista de continentes que presentan este habitat
     * @param id identificador del habitat
     */
    public Habitat(String nombre, String clima, String vegetacion, List<String> continentes, ObjectId id) {
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continentes = continentes;
        this.id = id;
    }

    /**
     * Constructor por omisión de habitat
     */
    public Habitat() {
    }

    /**
     * Método que obtiene el nombre del habitat 
     * @return nombre del habitat
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna un nombre al habitat
     * @param nombre nombre del habitat
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el clima del habitat
     * @return clima que presenta este habitat
     */
    public String getClima() {
        return clima;
    }

    /**
     * Método que asigna el clima del habitat
     * @param clima clima que presenta este habitat
     */
    public void setClima(String clima) {
        this.clima = clima;
    }

    /**
     * Método que obtiene la vegetación del habitat
     * @return vegetación que presenta este habitat
     */
    public String getVegetacion() {
        return vegetacion;
    }

    /**
     * Método que asigna la vegetacion del habitat
     * @param vegetacion vegetación que presenta este habitat
     */
    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }

    /**
     * Método que obtiene una lista de continentes del habitat
     * @return lista de continentes que presentan este habitat
     */
    public List<String> getContinentes() {
        return continentes;
    }

    /**
     * Método que asigna una lista de continentes al habitat
     * @param continentes lista de continentes que presentan este habitat
     */
    public void setContinentes(List<String> continentes) {
        this.continentes = continentes;
    }
    
    /**
     * Método que obtiene el identificador de habitat
     * @return identificador de habitat
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que asigna un identificador al habitat
     * @param id identificador del habitat
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Calcula y devuelve el valor hash del habitat
     * @return valor hash del objeto Habitat
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara el objeto Habitat con otro objeto para saber si son iguales
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
        final Habitat other = (Habitat) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
