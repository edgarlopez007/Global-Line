package Sprint2.Sprint2_GlobalLine.controladores;

import Sprint2.Sprint2_GlobalLine.entidades.Empleado;
import Sprint2.Sprint2_GlobalLine.servicios.ServiciosEmpleados;
import org.springframework.web.bind.annotation.*;

public class ControlEmpleados {


    ServiciosEmpleados servicesEm;

    //constructor
    public ControlEmpleados(ServiciosEmpleados servicesEm){
        this.servicesEm = servicesEm;
    }





    @GetMapping("/empleados/{id}")
    public Empleado LlamarEmpleado(@PathVariable Long id){
        return this.servicesEm.getLlamarEmpleado(id);
    }

    @PostMapping("/empleados")
    public Empleado crearEmpleado(@RequestBody Empleado em){
        return this.servicesEm.crearEmpleado(em);
    }

    //editar un registro
    @PutMapping("/empleados/{id}")
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado actEmpleado){
        return this.servicesEm.actualizarEm(id, actEmpleado);
    }

    //borrar un registro
    @DeleteMapping("/empleados/{id}")
    public Empleado eliminarEmpleado(@PathVariable(value = "id") Long id){
        return this.servicesEm.eliminarEm(id);
    }


}
