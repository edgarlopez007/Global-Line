package Sprint2.Sprint2_GlobalLine;

public class Empleado {
   private String nombreEmpleado;
   private String correoEmpleado;
   private String empresaEmpleado;
   private String rolEmpleado;
   private Integer numeroEmpleado;

   public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado,
                   String rolEmpleado, Integer numeroEmpleado) {
      this.nombreEmpleado = nombreEmpleado;
      this.correoEmpleado = correoEmpleado;
      this.empresaEmpleado = empresaEmpleado;
      this.rolEmpleado = rolEmpleado;
      this.numeroEmpleado = numeroEmpleado;
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
