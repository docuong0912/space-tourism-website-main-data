/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.destination;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 *
 * @author Asus
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Destination {
    @Id
    @SequenceGenerator(
            name = "des_generator",
            sequenceName= "des_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "des_generator"
    )
    private long id;
    private String name;
    private String images;
    private String description;
    private String travel;
    private String distance;

    public Destination(String name, String images, String description, String travel, String distance) {
        this.name = name;
        this.images = images;
        this.description = description;
        this.travel = travel;
        this.distance = distance;
    }
      
}
