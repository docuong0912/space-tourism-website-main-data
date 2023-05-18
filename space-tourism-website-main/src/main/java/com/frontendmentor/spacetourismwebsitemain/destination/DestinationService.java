/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frontendmentor.spacetourismwebsitemain.destination;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class DestinationService  {
    private final DestinationRepository dRes;
    @Autowired
    public DestinationService(DestinationRepository dRes) {
        this.dRes = dRes;
    }
    public List<Destination> getDestination(){
        return dRes.findAll();
    }
    @Transactional
    public ResponseEntity<Destination> getDestinationByName(String name) {
        Destination des = dRes.findAll().stream().filter(d->name.equals(d.getName())).findFirst().orElse(null);
        return ResponseEntity.ok(des);
    }
}
