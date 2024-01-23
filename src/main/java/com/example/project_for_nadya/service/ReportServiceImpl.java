package com.example.project_for_nadya.service;

import com.example.project_for_nadya.dao.ReportDao;
import com.example.project_for_nadya.entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportDao reportDao;


    @Override
    @Transactional
    public List<Child> getAllChild() {
        return reportDao.getAllChild();
    }

    @Override
    @Transactional
    public List<Child> getAllDebtor() {
        return reportDao.getAllDebtor();
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


}
