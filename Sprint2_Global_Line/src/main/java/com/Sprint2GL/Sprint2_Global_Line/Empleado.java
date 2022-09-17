package com.Sprint2GL.Sprint2_Global_Line;

public class Empleado {

    private int id;
    private String correo;
    private String perfil;
    private String enum_RoleName;
    private String empresa;
    private String transaccion;
    private int AtSubido;
    private int AtCreado;

    // constructor


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

    public String getEnum_RoleName() {
        return enum_RoleName;
    }

    public void setEnum_RoleName(String enum_RoleName) {
        this.enum_RoleName = enum_RoleName;
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

    public int getAtSubido() {
        return AtSubido;
    }

    public void setAtSubido(int atSubido) {
        AtSubido = atSubido;
    }

    public int getAtCreado() {
        return AtCreado;
    }

    public void setAtCreado(int atCreado) {
        AtCreado = atCreado;
    }

    public Empleado(int id, String correo, String perfil, String enum_RoleName, String empresa,
                    String transaccion, int atSubido, int atCreado) {
        this.id = id;
        this.correo = correo;
        this.perfil = perfil;
        this.enum_RoleName = enum_RoleName;
        this.empresa = empresa;
        this.transaccion = transaccion;
        AtSubido = atSubido;
        AtCreado = atCreado;

        //getters and setters


    }
}
