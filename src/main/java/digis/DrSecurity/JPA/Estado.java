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
public class Estado {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idestado;
    @Basic
    private String name;
    
    @ManyToOne
    @JoinColumn
    private Usuario usuario;

    public Estado() {
    }

    public Estado(int idestado) {
        this.idestado = idestado;
    }

    public Estado(int idestado, String name, Usuario usuario) {
        this.idestado = idestado;
        this.name = name;
        this.usuario = usuario;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
