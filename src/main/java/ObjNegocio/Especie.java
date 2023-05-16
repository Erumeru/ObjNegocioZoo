/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjNegocio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author eruma
 */
public class Especie {
    
    private String nomCientifico, descripcion, nomEspanol;
    private ObjectId id;
    private ObjectId habitat;
    private Zona zona;

    public Especie(String nomCientifico, String descripcion, String nomEspanol, ObjectId id, ObjectId habitat, Zona zona) {
        this.nomCientifico = nomCientifico;
        this.descripcion = descripcion;
        this.nomEspanol = nomEspanol;
        this.id = id;
        this.habitat = habitat;
        this.zona = zona;
    }
    
    public ObjectId getHabitat() {
        return habitat;
    }

    public void setHabitat(ObjectId habitat) {
        this.habitat = habitat;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

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

    @Override
    public String toString() {
        return "Especie{" + "nomCientifico=" + nomCientifico + ", descripcion=" + descripcion + ", nomEspanol=" + nomEspanol + ", id=" + id + ", habitat=" + habitat + '}';
    }
    
    
}
