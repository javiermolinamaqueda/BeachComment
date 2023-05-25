package com.beachcomment.Beach.controllers;

import com.beachcomment.Beach.models.Ciudad;
import com.beachcomment.Beach.repository.ICiudadRepo;
import com.beachcomment.Beach.service.ICiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CiudadController {
    @Autowired
    private ICiudadService ciudadService;

    @RequestMapping (value = "api/ciudades")
    public List<Ciudad> getCiudades() {
        return ciudadService.getCiudades();
    }
}
