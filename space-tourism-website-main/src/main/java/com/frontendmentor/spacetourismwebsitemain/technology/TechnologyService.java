/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.technology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.http.ResponseEntity;
/**
 *
 * @author Asus
 */
@Service
public class TechnologyService {
    private final TechnologyRepository techRes;
    @Autowired
    public TechnologyService(TechnologyRepository techRes) {
        this.techRes = techRes;
    }
    public List<Technology> getAllTech(){
        return techRes.findAll();
    }
    public ResponseEntity<Technology> getTechByName(String name){
        Technology technology = techRes.findAll().stream().filter(t->name.equals(t.getName())).findFirst().orElse(null);
        return ResponseEntity.ok(technology);
    }
}
