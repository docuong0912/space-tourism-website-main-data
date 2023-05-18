/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.crew;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Asus
 */
@Configuration
public class CrewConfig {
    @Bean
    CommandLineRunner crewLineRunner(CrewRepisitory cres){
        return args->{
            Crew crew1 = new Crew("Douglas Hurley","/crew/image-douglas-hurley.png","Commander","Douglas Gerald Hurley is an American engineer, former Marine Corps pilot and former NASA astronaut. He launched into space for the third time as commander of Crew Dragon Demo-2.");
            Crew crew2 = new Crew("Mark Shuttleworth","/crew/image-mark-shuttleworth.png","Mission Specialist","Mark Richard Shuttleworth is the founder and CEO of Canonical, the company behind the Linux-based Ubuntu operating system. Shuttleworth became the first South African to travel to space as a space tourist.");
            Crew crew3 = new Crew("Victor Glover","/crew/image-victor-glover.png","Pilot","Pilot on the first operational flight of the SpaceX Crew Dragon to the International Space Station. Glover is a commander in the U.S. Navy where he pilots an F/A-18.He was a crew member of Expedition 64, and served as a station systems flight engineer.");
            Crew crew4 = new Crew("Anousheh Ansari","/crew/image-anousheh-ansari.png","Flight Engineer","Anousheh Ansari is an Iranian American engineer and co-founder of Prodea Systems. Ansari was the fourth self-funded space tourist, the first self-funded woman to fly to the ISS, and the first Iranian in space.");
            cres.saveAll(List.of(crew1,crew2,crew3,crew4));
        };
        
    }
}
