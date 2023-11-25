/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digis.DrSecurity.JPA;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author digis
 */
@Entity
public class Colonia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcolonia;
    @Basic
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "idmunicipio")
    private Municipio municipio;

    public Colonia() {
    }

    public Colonia(int idcolonia) {
        this.idcolonia = idcolonia;
    }

    public Colonia(int idcolonia, String nombre, Municipio municipio) {
        this.idcolonia = idcolonia;
        this.nombre = nombre;
        this.municipio = municipio;
    }

    public int getIdcolonia() {
        return idcolonia;
    }

    public void setIdcolonia(int idcolonia) {
        this.idcolonia = idcolonia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

}
