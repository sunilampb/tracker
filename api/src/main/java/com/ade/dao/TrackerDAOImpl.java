package com.ade.dao;

import com.ade.Entity.Vehicle;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class TrackerDAOImpl implements TrackerDAO {
    @PersistenceContext
    private EntityManager em;

    public Vehicle findOne(String id){

        TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.getOne",Vehicle.class);
        query.setParameter("id", id);
        List<Vehicle> list = query.getResultList();
        return list.get(0);
    }

    public List<Vehicle> findAll(){
        TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.getAll",Vehicle.class);
        //ArrayList<Vehicle> list = (ArrayList<Vehicle>) query.getResultList();
        return query.getResultList();
    }

    public Vehicle postOne(Vehicle vehicle) {
        em.persist(vehicle);
        return vehicle;
    }

    public Vehicle putOne(String id, Vehicle vehicle){

        return em.merge(vehicle);
    }

    public void DeleteOne(String id){
        TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.getOne",Vehicle.class);
        query.setParameter("id", id);
        List<Vehicle> list = query.getResultList();
        em.remove(list.get(0));
    }
}
