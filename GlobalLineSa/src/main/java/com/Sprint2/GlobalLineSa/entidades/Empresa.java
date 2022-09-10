package com.Sprint2.GlobalLineSa.entidades;

public class Empresa {

    private Integer id;
    private String nombre;
    private String documento;
    private String telefono;
    private String direccion;
    private String user;

    //new
    private Empleado empleados;

    //constructor

    public Empresa(Integer id, String nombre, String documento, String telefono,
                   String direccion, String user, Empleado empleados) {

        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.user = user;
        this.empleados = empleados;
    }


    //getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Empleado getEmpledos() {
        return empleados;
    }

    public void setEmpledos(Empleado empledos) {
        this.empleados = empledos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", user='" + user + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
