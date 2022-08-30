package Sprint2.Sprint2_GlobalLine;

public class Transacciones {
    private String montoMovimiento;
    private Double ingreseMonto;
    private String conceptoMovimiento;
    private String encargadoMovimiento;


    public Transacciones(String montoMovimiento, Double ingreseMonto,
                         String conceptoMovimiento, String encargadoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.ingreseMonto = ingreseMonto;
        this.conceptoMovimiento = conceptoMovimiento;
        this.encargadoMovimiento = encargadoMovimiento;
    }

    public String getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(String montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public Double getIngreseMonto() {
        return ingreseMonto;
    }

    public void setIngreseMonto(Double ingreseMonto) {
        this.ingreseMonto = ingreseMonto;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getEncargadoMovimiento() {
        return encargadoMovimiento;
    }

    public void setEncargadoMovimiento(String encargadoMovimiento) {
        this.encargadoMovimiento = encargadoMovimiento;
    }
}
