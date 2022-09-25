package com.Sprint2GL.Sprint2_Global_Line;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;

import java.util.Date;

public class Empresa {

    private Long id;
    private String nombre;
    private String documento;
    private String telefono;
    private String direccion;
    private SecurityProperties.User usuario;
    private TransactionAutoConfiguration transaccion;
    private Date AtCreado;
    private Date AtSubido;

    // constructor


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public SecurityProperties.User getUsuario() {
        return usuario;
    }

    public void setUsuario(SecurityProperties.User usuario) {
        this.usuario = usuario;
    }

    public TransactionAutoConfiguration getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(TransactionAutoConfiguration transaccion) {
        this.transaccion = transaccion;
    }

    public Date getAtCreado() {
        return AtCreado;
    }

    public void setAtCreado(Date atCreado) {
        AtCreado = atCreado;
    }

    public Date getAtSubido() {
        return AtSubido;
    }

    public void setAtSubido(Date atSubido) {
        AtSubido = atSubido;
    }

    public Empresa(Long id, String nombre, String documento, String telefono, String direccion,
                   SecurityProperties.User usuario, TransactionAutoConfiguration transaccion,
                   Date atCreado, Date atSubido) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.usuario = usuario;
        this.transaccion = transaccion;
        AtCreado = atCreado;
        AtSubido = atSubido;

        //getters and setters


    }
}
