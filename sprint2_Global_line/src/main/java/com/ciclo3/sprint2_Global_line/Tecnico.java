package com.ciclo3.sprint2_Global_line;

public class Tecnico {

    private String nombre;
    private Integer registroServicio;
    private String especialidadTecnico;

    //new
    private Servicio servicios;

    //constructor

    public Tecnico(String nombre, Integer registroServicio, String especialidadTecnico, Servicio servicios) {
        this.nombre = nombre;
        this.registroServicio = registroServicio;
        this.especialidadTecnico = especialidadTecnico;
        this.servicios = servicios;
    }


    //getters and setters




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRegistroServicio() {
        return registroServicio;
    }

    public void setRegistroServicio(Integer registroServicio) {
        this.registroServicio = registroServicio;
    }

    public String getEspecialidadTecnico() {
        return especialidadTecnico;
    }

    public void setEspecialidadTecnico(String especialidadTecnico) {
        this.especialidadTecnico = especialidadTecnico;
    }

    public Servicio getServicios() {
        return servicios;
    }

    public void setServicios(Servicio servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombre='" + nombre + '\'' +
                ", registroServicio=" + registroServicio +
                ", especialidadTecnico='" + especialidadTecnico + '\'' +
                ", servicios=" + servicios +
                '}';
    }
}


