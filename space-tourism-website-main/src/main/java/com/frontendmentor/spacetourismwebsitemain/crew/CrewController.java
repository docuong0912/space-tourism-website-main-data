/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.crew;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@RestController
@RequestMapping(path = "api/v1/crew")
@CrossOrigin("https://space-tourism-website-main-cszn.vercel.app")
public class CrewController {
    private final CrewService service;
    @Autowired
    public CrewController(CrewService service) {
        this.service = service;
    }
    @GetMapping
    public List<Crew> getAllCrew(){
        return service.getAllCrew();
    }
    @GetMapping("{id}")
    public ResponseEntity<Crew> getCrewById(@PathVariable("id")Long id){
        return service.getCrewById(id);
    }
}
