package com.Sprint2GL.Sprint2_Global_Line;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.Date;

public class Dinero {

    private Long id;
    private String concepto;
    private Float monto;
    private SecurityProperties.User usuario;
    private Empresa empresa;
    private Date AtCreado;
    private Date AtSubido;

    //constructor

    public Dinero(Long id, String concepto, Float monto, SecurityProperties.User usuario,
                  Empresa empresa, Date atCreado, Date atSubido) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
        this.usuario = usuario;
        this.empresa = empresa;
        AtCreado = atCreado;
        AtSubido = atSubido;
    }


    //getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public SecurityProperties.User getUsuario() {
        return usuario;
    }

    public void setUsuario(SecurityProperties.User usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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







}
