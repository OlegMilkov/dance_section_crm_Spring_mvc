package com.example.project_for_nadya.service;

import com.example.project_for_nadya.entity.Child;

import java.util.List;

public interface ReportService {
    public List<Child> getAllChildren();

    public List<Child> getAllDebtors();


    public void saveChild(Child child);

    public Child getChild(int id);

    public void deleteChild(int id);

    public List<Child> getChildrenByGroup(String group_name);

    public  int getNumberOfChildrenInEachGroup (String group_name);
}

