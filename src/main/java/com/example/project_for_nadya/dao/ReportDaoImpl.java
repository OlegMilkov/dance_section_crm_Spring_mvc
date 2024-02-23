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
    //------------------------------------------------------------
    @Override
    public List<Child> getAllChildren() {
        Query query = entityManager.createQuery("from Child ");
        List<Child> allChildren = query.getResultList();
        return allChildren;
    }

    //------------------------------------------------------------
    @Override
    public List<Child> getAllDebtors() {
        Query query = entityManager.createQuery("SELECT c FROM Child c WHERE c.health_certificate = '-' OR c.form = '-' OR c.safety_rules = '-' OR c.birth_certificate = '-'");
        List<Child> result = query.getResultList();

        return result;
    }

    //------------------------------------------------------------
    @Override
    public void saveChild(Child child) {
        entityManager.merge(child);
    }

    //------------------------------------------------------------
    @Override
    public Child getChild(int id) {
        Child child = entityManager.find(Child.class, id);
        return child;
    }

    //------------------------------------------------------------
    @Override
    public void deleteChild(int id) {
        Query query = entityManager.createQuery("delete from Child " + "where id = :childId");
        query.setParameter("childId", id);
        query.executeUpdate();
    }

    //------------------------------------------------------------
    @Override
    public List<Child> getChildrenByGroup(String group_name) {
        Query query = entityManager.createQuery("SELECT c FROM Child c WHERE c.group_name = :groupName");
        query.setParameter("groupName", group_name);
        List<Child> result = query.getResultList();

        return result;
    }

    //------------------------------------------------------------
    @Override
    public int getNumberOfChildrenInEachGroup(String group_name){
        Query query = entityManager.createQuery("SELECT c FROM Child c WHERE c.group_name = :groupName");
        query.setParameter("groupName", group_name);
        List<Child> result = query.getResultList();
        int count=result.size();
        return count;
    }

    //------------------------------------------------------------
    @Override
    public List<Child> getChildrenByName(String name) {
        Query query = entityManager.createQuery("SELECT c FROM Child c WHERE c.name = :childName");
        query.setParameter("childName",name);
        List<Child> childName=query.getResultList();
        return childName;
    }
    //------------------------------------------------------------

    @Override
    public List<Child> getAllDistinctGroupNames() {
        Query query= entityManager.createQuery("SELECT DISTINCT c.group_name FROM Child c");
        List<Child> GroupNames = query.getResultList();

        return GroupNames;
    }

    //------------------------------------------------------------

    @Override
    public List<Child> getAllChildrenSortedByGroupAsc() {
        Query query = entityManager.createQuery("SELECT c FROM Child c ORDER BY c.group_name ASC");
        return query.getResultList();
    }

    @Override
    public List<Child> getAllChildrenSortedByGroupDesc() {
        Query query = entityManager.createQuery("SELECT c FROM Child c ORDER BY c.group_name DESC");
        return query.getResultList();
    }

}
