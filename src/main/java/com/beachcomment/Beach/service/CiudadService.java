package com.beachcomment.Beach.service;

import com.beachcomment.Beach.models.Ciudad;
import com.beachcomment.Beach.repository.ICiudadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadService implements ICiudadService{

    @Autowired
    ICiudadRepo ciudadRepo;

    @Override
    public List<Ciudad> getCiudades() {
        return (List<Ciudad>) ciudadRepo.findAll();
    }
}
