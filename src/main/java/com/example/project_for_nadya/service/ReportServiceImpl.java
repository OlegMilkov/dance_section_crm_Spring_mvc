package com.example.project_for_nadya.service;

import com.example.project_for_nadya.dao.ReportDao;
import com.example.project_for_nadya.entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportDao reportDao;


    @Override
    @Transactional
    public List<Child> getAllChildren() {
        return reportDao.getAllChildren();
    }

    @Override
    @Transactional
    public List<Child> getAllDebtors() {
        return reportDao.getAllDebtors();
    }

    @Override
    @Transactional
    public void saveChild(Child child) {
        reportDao.saveChild(child);
    }

    @Override
    @Transactional
    public Child getChild(int id) {
        return reportDao.getChild(id);
    }

    @Override
    @Transactional
    public void deleteChild(int id) {
        reportDao.deleteChild(id);
    }

    @Override
    @Transactional
    public List<Child> getChildrenByGroup(String group_name) {
        List<Child> childrenByGroup = reportDao.getChildrenByGroup(group_name);

        Collections.sort(childrenByGroup, Comparator.comparing(Child::getName));
        return childrenByGroup;

    }

    @Override
    @Transactional
    public int getNumberOfChildrenInEachGroup(String group_name) {
        return reportDao.getNumberOfChildrenInEachGroup(group_name);
    }

    @Override
    @Transactional
    public List<Child> getChildrenByName(String name) {
        return reportDao.getChildrenByName(name);
    }

    @Override
    @Transactional
    public List<Child>getAllDistinctGroupNames(){
        return reportDao.getAllDistinctGroupNames();
    }

}
