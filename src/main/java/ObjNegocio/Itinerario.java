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
public class Itinerario {
    
    private float longitud;
    private int maxVisitantes, numEspecies;
    private String nombre;
    private ObjectId id;
    private Dias dias[];
    private Date horaInicio, horaFin;

    public Itinerario(float longitud, int maxVisitantes, int numEspecies, String nombre, ObjectId id, Dias[] dias, Date horaInicio, Date horaFin) {
        this.longitud = longitud;
        this.maxVisitantes = maxVisitantes;
        this.numEspecies = numEspecies;
        this.nombre = nombre;
        this.id = id;
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
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

    public Dias[] getDias() {
        return dias;
    }

    public void setDias(Dias[] dias) {
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
    
    
}
