package com.Sprint2.GlobalLineSa.controladores;

import com.Sprint2.GlobalLineSa.entidades.Empresa;
import com.Sprint2.GlobalLineSa.servicios.ServiciosEmpresas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEmpresa {

    //prueba visualizacion

/*
    @GetMapping("/vista1")

    public String visualizar(){

        return "Prmiera vista de una web con Spring Boot agosto 27";
    }

    //metodo

    @GetMapping("vista2")

    public Empresa ControlEmpresa(){
        Empresa empresa1 = new Empresa(12356, "Santos S.A", "11223355", "3184565252", "Cra 1 # 2-5",
                "Santos", null);

        return empresa1;
    }



*/



    ServiciosEmpresas services;

    //contructor del controlador

    public ControlEmpresa(){
        this.services = new ServiciosEmpresas();

    }

    @GetMapping("/verempresa")

    public List<Empresa> verEmpresas(){
        return this.services.getListaEmpresas();
    }


}
