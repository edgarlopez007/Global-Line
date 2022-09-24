package Sprint2.Sprint2_GlobalLine.entidades;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    private Long usuarioEmpleado;

    @Column(name="Nombre empresa")
    private String nombreEmpresa;

    @Column(name ="Direccion empresa")
    private String direccionEmpresa;
    @Column(name ="tel empresa")
    private String telefonoEmpresa;

    @Column(name ="nit")
    private Integer nitEmpresa;

    public Empresa(){

    }

    /*
    public Empresa(Long documentoIdentidad, String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, Integer nitEmpresa) {
        this.usuarioEmpleado = usuarioEmpleado;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

     */

    public Long getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public void setUsuarioEmpleado(Long usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Integer getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(Integer nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
}



