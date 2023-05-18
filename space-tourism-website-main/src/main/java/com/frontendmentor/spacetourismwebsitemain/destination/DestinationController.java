/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.destination;

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
@RequestMapping(path = "api/v1/destination")
@CrossOrigin("https://space-tourism-website-main-cszn.vercel.app")
public class DestinationController {
    
    private final DestinationService dService;
    @Autowired
    public DestinationController(DestinationService dService) {
        this.dService = dService;
    }
    
    @GetMapping
    public List<Destination> getDestination(){
        return dService.getDestination();
    }
    @GetMapping("/{name}")
   public ResponseEntity<Destination> getDestinationById(@PathVariable("name")String name ){
        return dService.getDestinationByName(name);
    }
    
}
