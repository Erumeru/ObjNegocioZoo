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
 * Objeto de negocio que hace referencia a Itinerario
 * @author eruma
 */
public class Itinerario {
    
    private float longitud;
    private int maxVisitantes, numEspecies;
    private String nombre;
    private ObjectId id, guia;
    private List<Dias> dias;
    private LocalTime horaInicio, horaFin;
    private List<Especie> especies;

    /**
     * Constructor de la clase Itinerario que recibe todos los atributos
     * necesarios para inicializar un objeto Itinerario.
     * @param longitud longitud que se recorrerá 
     * @param maxVisitantes maximo de visitantes permitidos en el itinerario
     * @param numEspecies numero de especies que se veran siguiendo el itinerario
     * @param nombre nombre del itinerario
     * @param id identificador del itinerario 
     * @param guia guia encargado de dar el itinerario
     * @param dias dias que se hará el recorrido
     * @param horaInicio hora a la que iniciara el recorrido
     * @param horaFin hora a la que finalizará el recorrido
     * @param especies especies que se verán en el recorrido
     */
    public Itinerario(float longitud, int maxVisitantes, int numEspecies, String nombre, ObjectId id, ObjectId guia, List<Dias> dias, LocalTime horaInicio, LocalTime horaFin, List<Especie> especies) {
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

    /**
     * Constructor por omision de itinerario
     */
    public Itinerario() {
    }

    /**
     * Constructor de la clase Itinerario que recibe todos los atributos
     * necesarios menos Id para inicializar un objeto Itinerario.
     * @param longitud longitud que se recorrerá 
     * @param maxVisitantes maximo de visitantes permitidos en el itinerario
     * @param numEspecies numero de especies que se veran siguiendo el itinerario
     * @param nombre nombre del itinerario
     * @param guia guia encargado de dar el itinerario
     * @param dias dias que se hará el recorrido
     * @param horaInicio hora a la que iniciara el recorrido
     * @param horaFin hora a la que finalizará el recorrido
     * @param especies especies que se verán en el recorrido
     */
    public Itinerario(float longitud, int maxVisitantes, int numEspecies, String nombre, ObjectId guia, List<Dias> dias, LocalTime horaInicio, LocalTime horaFin, List<Especie> especies) {
        this.longitud = longitud;
        this.maxVisitantes = maxVisitantes;
        this.numEspecies = numEspecies;
        this.nombre = nombre;
        this.guia = guia;
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.especies = especies;
    }
    
    
    /**
     * Método que obtiene la longitud que se recorrerá
     * @return longitud del recorrido
     */
    public float getLongitud() {
        return longitud;
    }

    /**
     * Método que asigna la longitud del recorrido
     * @param longitud longitud del recorrido
     */
    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    /**
     * Método que obtiene el maximo de visitantes permitidos
     * @return maximo de visitantes permitidos en el itinerario
     */
    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    /**
     * Método que asigna el máximo de visitantes permitidos
     * @param maxVisitantes maximo de visitantes permitidos en el itinerario
     */
    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    /**
     * Método que obtiene el número de especies del recorrido
     * @return numero de especies que se veran siguiendo el itinerario
     */
    public int getNumEspecies() {
        return numEspecies;
    }

    /**
     * Método que asigna el número de especies que tendra el recorrido
     * @param numEspecies numero de especies que se veran siguiendo el itinerario
     */
    public void setNumEspecies(int numEspecies) {
        this.numEspecies = numEspecies;
    }

    /**
     * Método que obtiene el nombre del itinerario
     * @return  nombre del itinerario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna un nombre al itinerario
     * @param nombre nombre del itinerario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el identificador del itinerario
     * @return identificador del itinerario 
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que asigna un identificador a un itinerario
     * @param id identificador del itinerario 
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que obtiene los días en los que se hará el recorrido
     * @return dias que se hará el recorrido
     */
    public List<Dias> getDias() {
        return dias;
    }

    /**
     * Método que asigna los dias que se hará el recorrido
     * @param dias dias que se hará el recorrido
     */
    public void setDias(List<Dias> dias) {
        this.dias = dias;
    }
    
    /**
     * Método que obtiene la hora a la que inicia el recorrido
     * @return hora a la que iniciara el recorrido
     */
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    /**
     * Método que asigna la hora a la que inicia el recorrido
     * @param horaInicio hora a la que iniciara el recorrido
     */
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * Método que obtiene la hora a la que finaliza el recorrido
     * @return hora a la que finalizará el recorrido
     */
    public LocalTime getHoraFin() {
        return horaFin;
    }

    /**
     * Método que asigna una hora de finalizacion al recorrido
     * @param horaFin hora a la que finalizará el recorrido
     */
    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * Método que obtiene las especies que se verán en el recorrido
     * @return especies que se verán en el recorrido
     */
    public List<Especie> getEspecies() {
        return especies;
    }

    /**
     * Método que asigna especies al recorrido
     * @param especies especies que se verán en el recorrido
     */
    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    /**
     * Método que obtiene el guia encargado
     * @return guia encargado de dar el itinerario
     */
    public ObjectId getGuia() {
        return guia;
    }

    /**
     * Método que asigna un guía a un itinerario
     * @param guia guia encargado de dar el itinerario
     */
    public void setGuia(ObjectId guia) {
        this.guia = guia;
    }

    /**
     * Calcula y devuelve el valor hash del itinerario
     * @return valor hash del objeto Itinerario
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara el objeto Itinerario con otro objeto para saber si son iguales
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
        final Itinerario other = (Itinerario) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Devuelve una representación en cadena de los atributos del objeto
     * @return una cadena de texto donde se encuentren todos los atributos que conformen al itinerario 
     */
    @Override
    public String toString() {
        return "Itinerario{" + "longitud=" + longitud + ", maxVisitantes=" + maxVisitantes + ", numEspecies=" + numEspecies + ", nombre=" + nombre + ", id=" + id + ", guia=" + guia + ", dias=" + dias + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", especies=" + especies + '}';
    }
    
    
}
