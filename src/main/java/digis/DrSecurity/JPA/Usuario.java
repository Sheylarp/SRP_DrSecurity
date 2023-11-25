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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author digis
 */
@Entity

public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuario;
    @Basic
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;

    private String sexo;
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "idestado")
    private Estado estado;
    @ManyToOne
    @JoinColumn(name = "iddireccion")
    private DireccionActual direccionactual;

    private String curp;

    public Usuario() {
    }

    public Usuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(int idusuario, String nombre, String apellidopaterno, String apellidomaterno, Date fechanacimiento, String sexo, String telefono, Estado estado, DireccionActual direccionactual, String curp) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.fechanacimiento = fechanacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
        this.estado = estado;
        this.direccionactual = direccionactual;
        this.curp = curp;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public DireccionActual getDireccionactual() {
        return direccionactual;
    }

    public void setDireccionactual(DireccionActual direccionactual) {
        this.direccionactual = direccionactual;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

}
