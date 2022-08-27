package com.ciclo3.sprint2_Global_line;

public class Servicio {

    private Boolean atencion;
    private String diagnostico;
    private String arreglo;
    private String registroServicio;

    // constructor

    public Servicio(Boolean atencion, String diagnostico, String arreglo, String registroServicio) {
        this.atencion = atencion;
        this.diagnostico = diagnostico;
        this.arreglo = arreglo;
        this.registroServicio = registroServicio;
    }


    //getters and setters


    public Boolean getAtencion() {
        return atencion;
    }

    public void setAtencion(Boolean atencion) {
        this.atencion = atencion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getArreglo() {
        return arreglo;
    }

    public void setArreglo(String arreglo) {
        this.arreglo = arreglo;
    }

    public String getRegistroServicio() {
        return registroServicio;
    }

    public void setRegistroServicio(String registroServicio) {
        this.registroServicio = registroServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "atencion=" + atencion +
                ", diagnostico='" + diagnostico + '\'' +
                ", arreglo='" + arreglo + '\'' +
                ", registroServicio='" + registroServicio + '\'' +
                '}';
    }
}
