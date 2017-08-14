package com.ade.dao;

import com.ade.Entity.Vehicle;

import java.util.List;

public interface TrackerDAO {
    public Vehicle postOne(Vehicle vehicle);
    public Vehicle findOne(String id);
    public List<Vehicle> findAll();
    public Vehicle putOne(String id, Vehicle vehicle);
    public void DeleteOne(String id);
}
