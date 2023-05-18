/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.technology;
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
@RequestMapping(path = "api/v1/technology")
@CrossOrigin("http://localhost:3000")
public class TechnologyController {
    private final TechnologyService service;
    @Autowired
    public TechnologyController(TechnologyService service) {
        this.service = service;
    }
    @GetMapping
    public List<Technology> getAllTech(){
        return service.getAllTech();
    }
    @GetMapping("/{name}")
    public ResponseEntity<Technology> getTechByName(@PathVariable("name")String name){
        return service.getTechByName(name);
    }
}
