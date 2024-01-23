package com.example.project_for_nadya.dao;

import com.example.project_for_nadya.entity.Child;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReportDaoImpl implements ReportDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Child> getAllChild() {
        Query query = entityManager.createQuery("from Child ");
        List<Child> allChild = query.getResultList();
        return allChild;
    }
    //------------------------------------------------------------
    @Override
    public List<Child> getAllDebtor() {
        Query query = entityManager.createQuery("SELECT c FROM Child c WHERE c.health_certificate = '-' OR c.form = '-' OR c.safety_rules = '-' OR c.birth_certificate = '-'");
        List<Child> result = query.getResultList();

        return result;
    }
    //------------------------------------------------------------
    @Override
    public void saveChild(Child child) {
        entityManager.merge(child);
    }

    @Override
    public Child getChild(int id) {
        Child child = entityManager.find(Child.class, id);
        return child;
    }

    @Override
    public void deleteChild(int id) {
        Query query = entityManager.createQuery("delete from Child "+"where id = :childId");
        query.setParameter("childId", id);
        query.executeUpdate();
    }


}
