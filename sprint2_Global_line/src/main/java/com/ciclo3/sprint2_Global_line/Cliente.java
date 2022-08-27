package com.ciclo3.sprint2_Global_line;

public class Cliente {

    private String nombre;
    private Integer documentoIdentidad;
    private String modeloTelefono;
    private Integer telefonoNumero;
    private String decripcionProblema;

    //new

    private Tecnico tecnicos;

//constructor

    public Cliente(String nombre, Integer documentoIdentidad, String modeloTelefono,
                   Integer telefonoNumero, String decripcionProblema, Tecnico tecnicos) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.modeloTelefono = modeloTelefono;
        this.telefonoNumero = telefonoNumero;
        this.decripcionProblema = decripcionProblema;
        this.tecnicos = tecnicos;
    }


//getters and setters




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Integer documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getModeloTelefono() {
        return modeloTelefono;
    }

    public void setModeloTelefono(String modeloTelefono) {
        this.modeloTelefono = modeloTelefono;
    }

    public Integer getTelefonoNumero() {
        return telefonoNumero;
    }

    public void setTelefonoNumero(Integer telefonoNumero) {
        this.telefonoNumero = telefonoNumero;
    }

    public String getDecripcionProblema() {
        return decripcionProblema;
    }

    public void setDecripcionProblema(String decripcionProblema) {
        this.decripcionProblema = decripcionProblema;
    }

    public Tecnico getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(Tecnico tecnicos) {
        this.tecnicos = tecnicos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", documentoIdentidad=" + documentoIdentidad +
                ", modeloTelefono='" + modeloTelefono + '\'' +
                ", telefonoNumero=" + telefonoNumero +
                ", decripcionProblema='" + decripcionProblema + '\'' +
                ", tecnicos=" + tecnicos +
                '}';
    }
}
