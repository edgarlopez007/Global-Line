package Sprint2.Sprint2_GlobalLine.servicios;
import Sprint2.Sprint2_GlobalLine.entidades.Transacciones;
import Sprint2.Sprint2_GlobalLine.repositorios.repositorioTransacciones;

public class ServiciosTransacciones {

    private repositorioTransacciones repositorioTra;

    public ServiciosTransacciones(repositorioTransacciones repositorioTra){
        this.repositorioTra = repositorioTra;
    }




    //mostrar encargado movimiento
    public Transacciones getLlamarEncargadoMovimiento(Long id){
        return this.repositorioTra.findById(id).orElseThrow();
    }

    //crear movimientos
    public Transacciones crearEncar(Transacciones nuevoEncargado){
        return this.repositorioTra.save(nuevoEncargado);
    }
}
