/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjNegocio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author eruma
 */
public class Guia {
    private String telefono, calle, colonia, numDireccion, nombre, apellidoPat, apellidoMat;
    private Date fechaInicio;
    private ObjectId id;

    public Guia(String telefono, String calle, String colonia, String numDireccion, String nombre, String apellidoPat, String apellidoMat, Date fechaInicio, ObjectId id) {
        this.telefono = telefono;
        this.calle = calle;
        this.colonia = colonia;
        this.numDireccion = numDireccion;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.fechaInicio = fechaInicio;
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCalle() {
        return calle;
    }

    public String getColonia() {
        return colonia;
    }

    public String getNumDireccion() {
        return numDireccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public ObjectId getId() {
        return id;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setNumDireccion(String numDireccion) {
        this.numDireccion = numDireccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
}
