package com.mycompany.roadtripplanner.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entité Conversion
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conversion {

    @Id
    private String id;
    private float initialSum;
    private float rate;
    private String symbolCurrency;

}
