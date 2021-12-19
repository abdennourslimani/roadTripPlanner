package com.mycompany.roadtripplanner.dtos;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor

public abstract class servicesDTO {
    private String id;
    private String name;


}
