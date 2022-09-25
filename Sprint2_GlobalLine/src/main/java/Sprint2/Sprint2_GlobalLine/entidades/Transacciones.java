package Sprint2.Sprint2_GlobalLine.entidades;

import javax.persistence.*;

@Entity
@Table(name = "transacciones")
public class Transacciones {

    @Id
    private String encargadoMovimiento;
    @Column(name= "monto del movimiento")
    private Float montoMovimiento;

    @Column(name="Ingreso del monto")
    private Float ingreseMonto;
    @Column(name="concepto movimiento")
    private String conceptoMovimiento;

    public Transacciones(){

    }

/*
    public Transacciones(String encargadoMovimiento, String montoMovimiento, Double ingreseMonto, String conceptoMovimiento) {
        this.encargadoMovimiento = encargadoMovimiento;
        this.montoMovimiento = montoMovimiento;
        this.ingreseMonto = ingreseMonto;
        this.conceptoMovimiento = conceptoMovimiento;
    }

 */

    public String getEncargadoMovimiento() {
        return encargadoMovimiento;
    }

    public void setEncargadoMovimiento(String encargadoMovimiento) {
        this.encargadoMovimiento = encargadoMovimiento;
    }

    public Float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(Float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public Float getIngreseMonto() {
        return ingreseMonto;
    }

    public void setIngreseMonto(Float ingreseMonto) {
        this.ingreseMonto = ingreseMonto;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }
}