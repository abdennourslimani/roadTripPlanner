package com.mycompany.roadtripplanner.services;

import com.mycompany.roadtripplanner.repositories.ServicesRepositoryImpl;
import org.modelmapper.ModelMapper;

public class ServicesService {

    ModelMapper mapper;
    ServicesRepositoryImpl repository;

    public ServicesService(ModelMapper mapper, ServicesRepositoryImpl repository) {
        this.mapper = mapper;
        this.repository = repository;
    }
}
