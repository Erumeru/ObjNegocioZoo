/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjNegocio;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author eruma
 */
public class Itinerario {
    
    private float longitud;
    private int maxVisitantes, numEspecies;
    private String nombre;
    private ObjectId id, guia;
    private List<Dias> dias;
    private Date horaInicio, horaFin;
    private List<Especie> especies;

    public Itinerario(float longitud, int maxVisitantes, int numEspecies, String nombre, ObjectId id, ObjectId guia, List<Dias> dias, Date horaInicio, Date horaFin, List<Especie> especies) {
        this.longitud = longitud;
        this.maxVisitantes = maxVisitantes;
        this.numEspecies = numEspecies;
        this.nombre = nombre;
        this.id = id;
        this.guia = guia;
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.especies = especies;
    }
    
    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    public int getNumEspecies() {
        return numEspecies;
    }

    public void setNumEspecies(int numEspecies) {
        this.numEspecies = numEspecies;
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

    public List<Dias> getDias() {
        return dias;
    }

    public void setDias(List<Dias> dias) {
        this.dias = dias;
    }
    
    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    public ObjectId getGuia() {
        return guia;
    }

    public void setGuia(ObjectId guia) {
        this.guia = guia;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Itinerario other = (Itinerario) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
