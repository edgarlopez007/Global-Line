package Sprint2.Sprint2_GlobalLine.servicios;

import Sprint2.Sprint2_GlobalLine.entidades.Empresa;
import Sprint2.Sprint2_GlobalLine.repositorios.repositorioEmpresa;
import org.springframework.stereotype.Service;

@Service
public class ServiciosEmpresa {

    private repositorioEmpresa repositorioEmpre;

    //constructor
    public ServiciosEmpresa(repositorioEmpresa repositorioEmpre){
        this.repositorioEmpre = repositorioEmpre;
    }



    //llamar uno solo
    public Empresa getLlamarUsua(Long id){
        return this.repositorioEmpre.findById(id).orElseThrow();
    }

    //Usua = usuarioEmpleado
    //método para crear a partir del POST
    public Empresa crearUsua(Empresa nuevoUsua){
        return this.repositorioEmpre.save(nuevoUsua);
    }

    //método para actualizar
    public Empresa actualizarUsua(Long id, Empresa usua){
        Empresa usuaActual = repositorioEmpre.findById(id).orElseThrow();
        usuaActual.setUsuarioEmpleado(usua.getUsuarioEmpleado());
        usuaActual.setNombreEmpresa(usua.getNombreEmpresa());
        return this.repositorioEmpre.save(usuaActual);
    }

    //método para eliminar

    public Empresa eliminarUsua(Long id){
        Empresa usuaActual = repositorioEmpre.findById(id).orElseThrow(); //pero esta, muestra lo que se borró
        this.repositorioEmpre.deleteById(id);  //solo con esta línea funciona
        return usuaActual;
    }



}


