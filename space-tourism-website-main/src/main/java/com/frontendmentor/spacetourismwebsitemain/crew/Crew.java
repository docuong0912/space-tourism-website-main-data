/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.crew;

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
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Crew {
    @Id
    @SequenceGenerator(
      name = "crew_sequence",
      sequenceName = "crew_sequence",
      allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "crew_sequence"
    )
    private long id;
    private String name;
    private String image;
    private String role;
    private String bio;

    public Crew(String name, String image, String role, String bio) {
        this.name = name;
        this.image = image;
        this.role = role;
        this.bio = bio;
    }
    
}
