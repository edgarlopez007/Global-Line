package Sprint2.Sprint2_GlobalLine.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {

   @Id
   private Long documentoIdentidad;
   @Column(name="nombre empleado")
   private String nombreEmpleado;

   @Column(name="correo")
   private String correoEmpleado;
   @Column(name="empresa empleado")
   private String empresaEmpleado;

   @Column(name="rol")
   private String rolEmpleado;

   @Column(name="numero")
   private Integer numeroEmpleado;

   public Empleado(){

   }

   /*
   public Empleado(Long documentoIdentidad, String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rolEmpleado, Integer numeroEmpleado) {
      this.documentoIdentidad = documentoIdentidad;
      this.nombreEmpleado = nombreEmpleado;
      this.correoEmpleado = correoEmpleado;
      this.empresaEmpleado = empresaEmpleado;
      this.rolEmpleado = rolEmpleado;
      this.numeroEmpleado = numeroEmpleado;
   }

    */

   public Long getDocumentoIdentidad() {
      return documentoIdentidad;
   }

   public void setDocumentoIdentidad(Long documentoIdentidad) {
      this.documentoIdentidad = documentoIdentidad;
   }

   public String getNombreEmpleado() {
      return nombreEmpleado;
   }

   public void setNombreEmpleado(String nombreEmpleado) {
      this.nombreEmpleado = nombreEmpleado;
   }

   public String getCorreoEmpleado() {
      return correoEmpleado;
   }

   public void setCorreoEmpleado(String correoEmpleado) {
      this.correoEmpleado = correoEmpleado;
   }

   public String getEmpresaEmpleado() {
      return empresaEmpleado;
   }

   public void setEmpresaEmpleado(String empresaEmpleado) {
      this.empresaEmpleado = empresaEmpleado;
   }

   public String getRolEmpleado() {
      return rolEmpleado;
   }

   public void setRolEmpleado(String rolEmpleado) {
      this.rolEmpleado = rolEmpleado;
   }

   public Integer getNumeroEmpleado() {
      return numeroEmpleado;
   }

   public void setNumeroEmpleado(Integer numeroEmpleado) {
      this.numeroEmpleado = numeroEmpleado;
   }
}
