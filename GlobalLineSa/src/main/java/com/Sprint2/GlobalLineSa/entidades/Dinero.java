package com.Sprint2.GlobalLineSa.entidades;

public class Dinero {

    private int id;
    private String concepto;
    private int monto;
    private String empresa;
    private String usuario;

    //constructor

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
