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
public class Especie {
    
    private String nomCientifico, descripcion, nomEspanol;
    private ObjectId id;

    public Especie(String nomCientifico, String descripcion, String nomEspanol, ObjectId id) {
        this.nomCientifico = nomCientifico;
        this.descripcion = descripcion;
        this.nomEspanol = nomEspanol;
        this.id = id;
    }

    public String getNomCientifico() {
        return nomCientifico;
    }

    public void setNomCientifico(String nomCientifico) {
        this.nomCientifico = nomCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNomEspanol() {
        return nomEspanol;
    }

    public void setNomEspanol(String nomEspanol) {
        this.nomEspanol = nomEspanol;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
}
