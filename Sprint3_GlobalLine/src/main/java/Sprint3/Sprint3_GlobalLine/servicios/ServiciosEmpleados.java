package Sprint2.Sprint2_GlobalLine.servicios;

import Sprint2.Sprint2_GlobalLine.entidades.Empleado;
import Sprint2.Sprint2_GlobalLine.repositorios.repositorioEmpleados;

public class ServiciosEmpleados {

    private repositorioEmpleados repositorioEm;
    //constructor
    public ServiciosEmpleados(repositorioEmpleados repositorioEm){
        this.repositorioEm = repositorioEm;
    }



    //llamar uno solo
    public Empleado getLlamarEmpleado(Long id){
        return this.repositorioEm.findById(id).orElseThrow();
    }

    //método para crear a partir del POST
    public Empleado crearEmpleado (Empleado nuevoEmpleado){
        return this.repositorioEm.save(nuevoEmpleado);
    }

    //método para actualizar
    public Empleado actualizarEm(Long id, Empleado em){
        Empleado empleadoActual = repositorioEm.findById(id).orElseThrow();
        empleadoActual.setNombreEmpleado(em.getNombreEmpleado());
        empleadoActual.setEmpresaEmpleado(em.getEmpresaEmpleado());
        return this.repositorioEm.save(empleadoActual);
    }

    //método para eliminar

    public Empleado eliminarEm(Long id){
        Empleado empleadoActual = repositorioEm.findById(id).orElseThrow(); //pero esta, muestra lo que se borró
        this.repositorioEm.deleteById(id);  //solo con esta línea funciona
        return empleadoActual;
    }
}
