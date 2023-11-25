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
public class DireccionActual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddireccion;
    @Basic
    private String calle;
    private String numero;
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idcolonia")
    private Colonia colonia;

    public DireccionActual() {
    }

    public DireccionActual(int iddireccion) {
        this.iddireccion = iddireccion;
    }

    public DireccionActual(int iddireccion, String calle, String numero, Usuario usuario, Colonia colonia) {
        this.iddireccion = iddireccion;
        this.calle = calle;
        this.numero = numero;
        this.usuario = usuario;
        this.colonia = colonia;
    }

    public int getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(int iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Colonia getColonia() {
        return colonia;
    }

    public void setColonia(Colonia colonia) {
        this.colonia = colonia;
    }

}
