package com.ade.bo;

import com.ade.Entity.Vehicle;

import java.util.List;

public interface TrackerService {
    public Vehicle postOne(Vehicle vehicle);
    public Vehicle findOne(String id);
    public List<Vehicle> findAll();
    public Vehicle putOne(String id, Vehicle vehicle);
    public void DeleteOne(String id);

}
