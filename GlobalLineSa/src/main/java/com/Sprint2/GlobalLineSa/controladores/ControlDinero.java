package com.Sprint2.GlobalLineSa.controladores;


import com.Sprint2.GlobalLineSa.servicios.ServiciosDinero;
import com.Sprint2.GlobalLineSa.servicios.ServiciosEmpleados;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlDinero {


    ServiciosDinero services;

    //constructor

    public ControlDinero(ServiciosDinero services) {
        this.services = services;
    }
}

