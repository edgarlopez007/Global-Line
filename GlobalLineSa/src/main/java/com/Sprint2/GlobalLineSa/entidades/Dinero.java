package com.Sprint2.GlobalLineSa.entidades;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "dinero")
public class Dinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "id")
    private int id;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "monto")
    private int monto;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "usuario")
    private String usuario;

    //constructor

    public Dinero() {
    }

    public Dinero(int id, String concepto, int monto,
                  String empresa, String usuario) {

        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
        this.empresa = empresa;
        this.usuario = usuario;
    }


    //getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Dinero{" +
                "id=" + id +
                ", concepto='" + concepto + '\'' +
                ", monto=" + monto +
                ", empresa=" + empresa +
                ", usuario=" + usuario +
                '}';
    }
}
