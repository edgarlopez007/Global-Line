package Sprint2.Sprint2_GlobalLine.controladores;

import Sprint2.Sprint2_GlobalLine.entidades.Empresa;
import Sprint2.Sprint2_GlobalLine.servicios.ServiciosEmpresa;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControlEmpresa {


    ServiciosEmpresa servicesEmpre;

    //cosntructor
    public ControlEmpresa(ServiciosEmpresa servicesEmpre){
        this.servicesEmpre = servicesEmpre;
    }

    @GetMapping("/empresa/{id}")
    public Empresa LlamarUsua(@PathVariable Long id){
        return this.servicesEmpre.getLlamarUsua(id);
    }

    @PostMapping("/Empresa")
    public Empresa crearUsua(@RequestBody Empresa emp){
        return this.servicesEmpre.crearUsua(emp);
    }

    //editar un registro
    @PutMapping("/empresa/{id}")
    public Empresa actualizarUsuario(@PathVariable Long id, @RequestBody Empresa actUsua){
        return this.servicesEmpre.actualizarUsua(id, actUsua);
    }

    //borrar un registro
    @DeleteMapping("/empresa/{id}")
    public Empresa eliminarUsuarios(@PathVariable(value = "id") Long id){
        return this.servicesEmpre.eliminarUsua(id);
    }
}
