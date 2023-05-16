/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjNegocio;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Objeto de negocio que hace referencia a Guia
 * @author eruma
 */
public class Guia {
    private String telefono, calle, colonia, numDireccion, nombre, apellidoPat, apellidoMat;
    private LocalTime  fechaInicio;
    private ObjectId id;

    /**
     * Constructor de la clase Guía que recibe todos los atributos
     * necesarios para inicializar un objeto Guía.
     * @param telefono numero telefonico del guia
     * @param calle calle de la dirección del guía
     * @param colonia colonia de la dirección del guía
     * @param numDireccion número de la dirección del guía
     * @param nombre nombre del guía
     * @param apellidoPat apellido paterno del guía
     * @param apellidoMat apellido materno del guía
     * @param fechaInicio fecha cuando empezó a trabajar el guía
     */
    public Guia(String telefono, String calle, String colonia, String numDireccion, String nombre, String apellidoPat, String apellidoMat, LocalTime fechaInicio) {
        this.telefono = telefono;
        this.calle = calle;
        this.colonia = colonia;
        this.numDireccion = numDireccion;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.fechaInicio = fechaInicio;
    }

    /**
     * Constructor por omisión de Guia
     */
    public Guia() {
    }

   /**
    * Método que obtiene el número telefonico del guía
    * @return numero telefónico del guia
    */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método que obtiene la calle de la dirección del guía
     * @return calle de la dirección del guía
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Método que obtiene la colonia de la dirección del guía
     * @return colonia de la dirección del guía
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Método que obtiene el número de la dirección del guía
     * @return número de la dirección del guía
     */
    public String getNumDireccion() {
        return numDireccion;
    }

    /**
     * Método para obtener el nombre del guia
     * @return nombre de guia
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el apellido paterno del guia
     * @return apellido paterno del guia
     */
    public String getApellidoPat() {
        return apellidoPat;
    }

    /**
     * Método para obtener el apellido materno del guia
     * @return apellido materno del guia
     */
    public String getApellidoMat() {
        return apellidoMat;
    }

    /**
     * Método para obtener la fecha de comienzo de trabajo del guia
     * @return fecha de comienzo del guia
     */
    public LocalTime getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Método para obtener el identificador del guia
     * @return identificador de guia
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que asigna un número telefonico al guia
     * @param telefono numero telefonico del guia
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método que asigna una calle de la dirección del guía 
     * @param calle calle de la dirección del guía
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Método que asigna una colonia a la dirección del guía
     * @param colonia colonia de la dirección del guía
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Método que asigna un número a la dirección del guía
     * @param numDireccion número de la dirección del guía
     */
    public void setNumDireccion(String numDireccion) {
        this.numDireccion = numDireccion;
    }

    /**
     * Método que asigna un nombre al guía
     * @param nombre nombre del guía
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que asigna un apellido paterno al guía
     * @param apellidoPat apellido paterno del guía
     */
    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    /**
     * Método que asigna un apellido materno al guía
     * @param apellidoMat apellido materno del guía
     */
    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    /**
     * Método que asigna la fecha de inicio de trabajo del guía
     * @param fechaInicio fecha cuando empezó a trabajar el guía
     */
    public void setFechaInicio(LocalTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Método que asigna un identificador al guía
     * @param id identificador del guía
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Calcula y devuelve el valor hash del guia
     * @return valor hash del objeto Guia
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara el objeto Guia con otro objeto para saber si son iguales
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
        final Guia other = (Guia) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Devuelve una representación en cadena de los atributos del objeto
     * @return una cadena de texto donde se encuentren todos los atributos que conformen al guia 
     */
    @Override
    public String toString() {
        return "Guia{" + "telefono=" + telefono + ", calle=" + calle + ", colonia=" + colonia + ", numDireccion=" + numDireccion + ", nombre=" + nombre + ", apellidoPat=" + apellidoPat + ", apellidoMat=" + apellidoMat + ", fechaInicio=" + fechaInicio +  ", id=" + id + '}';
    }
    
    
}
