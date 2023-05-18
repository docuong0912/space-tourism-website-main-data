/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.crew;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class CrewService {
    private final CrewRepisitory cRes;
    @Autowired
    public CrewService(CrewRepisitory cRes) {
        this.cRes = cRes;
    }
    public List<Crew> getAllCrew(){
        return cRes.findAll();
    }
    public ResponseEntity<Crew> getCrewById(Long id){
        Crew crew = cRes.findAll().stream().filter(c->id.equals(c.getId())).findFirst().orElse(null);
        return ResponseEntity.ok(crew);
    }
}
