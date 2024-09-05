package com.example.dance_section_crm_Spring_mvc.service;

import com.example.dance_section_crm_Spring_mvc.entity.Child;

import java.util.List;

public interface ReportService {
    public List<Child> getAllChildren();

    public List<Child> getAllDebtors();

    public void saveChild(Child child);

    public Child getChild(int id);

    public void deleteChild(int id);

    public List<Child> getChildrenByGroup(String group_name);

    public  int getNumberOfChildrenInEachGroup (String group_name);

    public List<Child>getChildrenByName(String name);

    public List <Child> getAllDistinctGroupNames();

    public List<Child> getAllChildrenSortedByGroupAsc();

    public List<Child> getAllChildrenSortedByGroupDesc();

}

