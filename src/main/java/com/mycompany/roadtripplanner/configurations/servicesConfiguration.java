package com.mycompany.roadtripplanner.configurations;

import com.mycompany.roadtripplanner.repositories.ServicesRepositoryImpl;
import com.mycompany.roadtripplanner.services.ServicesService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class servicesConfiguration {

    @Bean
    public ServicesService servicesService(ModelMapper mapper, ServicesRepositoryImpl repository) {
        return new ServicesService(mapper, repository);
    }



}
