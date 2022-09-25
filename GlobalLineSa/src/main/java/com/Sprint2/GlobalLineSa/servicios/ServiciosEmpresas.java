package com.Sprint2.GlobalLineSa.servicios;

import com.Sprint2.GlobalLineSa.entidades.Empresa;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


public class ServiciosEmpresas {

    //atributo del tipo empresa es igual a un objeto

    Empresa empresa1;
    Empresa empresa2;
    List<Empresa> listaEmpresas;

    public ServiciosEmpresas(){

        listaEmpresas = new ArrayList<Empresa>();


        this.empresa1 = new Empresa(12356, "Santos S.A", "11223355", "3184565252", "Cra 1 # 2-5",
                "Santos", null);

        this.empresa2 = new Empresa(56555, "Bodegas S.A", "45578899", "3154789652", "Cra 61 # 22-65",
                "Bodegas", null);

        listaEmpresas.add(empresa1);
        listaEmpresas.add(empresa2);

    }

    //método getter para obtener datos de lista Empresas
    public List<Empresa> getListaEmpresas(){
        return this.listaEmpresas;
    }


}
