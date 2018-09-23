package com.ade.bo;

import com.ade.Entity.Vehicle;
import com.ade.dao.TrackerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TrackerServiceImpl implements TrackerService {
    @Autowired
    private TrackerDAO dao;

        @Transactional
        public Vehicle postOne(Vehicle vehicle) {
            return dao.postOne(vehicle);
        }

    public Vehicle findOne(String id) {
        return dao.findOne(id);
    }

    public List<Vehicle> findAll() {
        return dao.findAll();
    }

    @Transactional
    public Vehicle putOne(String id, Vehicle vehicle) {
        return dao.putOne(id,vehicle);
    }

    @Transactional
    public void DeleteOne(String id) {
            dao.DeleteOne(id);
    }


}
