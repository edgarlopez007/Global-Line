package Sprint2.Sprint2_GlobalLine.controladores;


import Sprint2.Sprint2_GlobalLine.entidades.Transacciones;
import Sprint2.Sprint2_GlobalLine.servicios.ServiciosTransacciones;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControlTransacciones {

    ServiciosTransacciones servicesTra;

    //constructor
    public ControlTransacciones(ServiciosTransacciones servicesTra){
        this.servicesTra = servicesTra;
    }

    @GetMapping("/servicios/{id}")
    public Transacciones LlamarEncargado(@PathVariable Long id){
        return this.servicesTra.getLlamarEncargadoMovimiento(id);
    }

    @PostMapping("/servicios")
    public Transacciones crearEncar(@RequestBody Transacciones s){
        return this.servicesTra.crearEncar(s);
    }


}
