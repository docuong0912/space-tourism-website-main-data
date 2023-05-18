/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.destination;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Asus
 */
@Configuration
public class DestinationConfig {
    @Bean
    CommandLineRunner commandLineRunner(DestinationRepository dRes){
        return args ->{
            Destination moon = new Destination(
                    "Moon",
                    "/destination/image-moon.png",
                    "See our planet as you’ve never seen it before. A perfect relaxing trip away to help regain perspective and come back refreshed. While you’re there, take in some history by visiting the Luna 2 and Apollo 11 landing sites.",
                    "3 days",
                    "384,400 km"
            );
             Destination mars = new Destination(
                    "Mars",
                    "/destination/image-mars.png",
                    "Don’t forget to pack your hiking boots. You’ll need them to tackle Olympus Mons, the tallest planetary mountain in our solar system. It’s two and a half times the size of Everest!",
                    "9 months",
                    "225 mil. km"
            );
              Destination europa = new Destination(
                    "Europa",
                    "/destination/image-europa.png",
                    "The smallest of the four Galilean moons orbiting Jupiter, Europa is a winter lover’s dream. With an icy surface, it’s perfect for a bit of ice skating, curling, hockey, or simple relaxation in your snug wintery cabin.",
                    "3 years ",
                    "628 mil. km"
            );
               Destination titan = new Destination(
                    "Titan",
                    "/destination/image-titan.png",
                    "The only moon known to have a dense atmosphere other than Earth, Titan is a home away from home (just a few hundred degrees colder!). As a bonus, you get striking views of the Rings of Saturn.",
                    "7 years",
                    "1.6 bil. km"
            );
            dRes.saveAll(List.of(moon,mars,europa,titan));
            
        };
    }
}
