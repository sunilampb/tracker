package com.ade.controller;
import com.ade.Entity.Vehicle;
import com.ade.bo.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/readings")
@CrossOrigin(origins = "http://mocker.egen.io")
public class TrackerController {

    @Autowired
    TrackerService bo;

    @PostMapping
    public ResponseEntity postOne(@RequestBody Vehicle vehicle){

        return new ResponseEntity(bo.postOne(vehicle), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findOne(@PathVariable String id){

        return new ResponseEntity(bo.findOne(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity findAll(){

        return new ResponseEntity(bo.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void findAll(@PathVariable String id){
        bo.DeleteOne(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity putOne(@PathVariable String id, @RequestBody Vehicle vehicle){
        return new ResponseEntity(bo.putOne(id, vehicle), HttpStatus.OK);
    }



}