package com.Sprint2.GlobalLineSa.entidades;

public class Empleado {

    private int id;
    private String correo;
    private String perfil;
    private String rol;
    private String empresa;
    private String transaccion;

    //new
    private Dinero dineros;

    //constructor

    public Empleado(int id, String correo, String perfil, String rol,
                    String empresa, String transaccion, Dinero dineros) {

        this.id = id;
        this.correo = correo;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
        this.transaccion = transaccion;
        this.dineros = dineros;
    }


    //getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public Dinero getDineros() {
        return dineros;
    }

    public void setDineros(Dinero dineros) {
        this.dineros = dineros;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", perfil='" + perfil + '\'' +
                ", rol='" + rol + '\'' +
                ", empresa='" + empresa + '\'' +
                ", transaccion='" + transaccion + '\'' +
                ", dineros=" + dineros +
                '}';
    }
}
