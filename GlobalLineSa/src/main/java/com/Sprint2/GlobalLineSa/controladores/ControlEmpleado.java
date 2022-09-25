package com.Sprint2.GlobalLineSa.controladores;

import com.Sprint2.GlobalLineSa.entidades.Empleado;
import com.Sprint2.GlobalLineSa.servicios.ServiciosEmpleados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControlEmpleado {


    ServiciosEmpleados services;

    //constructo

    public ControlEmpleado(ServiciosEmpleados services) {
        this.services = services;
    }


}
