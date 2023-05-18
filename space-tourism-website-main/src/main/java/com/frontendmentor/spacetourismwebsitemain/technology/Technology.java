/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.technology;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Asus
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Technology {
    @Id
    @SequenceGenerator(
            name = "tech_generator",
            sequenceName = "tech_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tech_generator"
    )
    private long id;
    private String name;
    private String imagePotrait;
    private String imageLandscape;
    @Column(
            columnDefinition = "TEXT"
        )
    private String description;

    public Technology(String name, String imagePotrait, String imageLandscape, String description) {
        this.name = name;
        this.imagePotrait = imagePotrait;
        this.imageLandscape = imageLandscape;
        this.description = description;
    }

    
}
