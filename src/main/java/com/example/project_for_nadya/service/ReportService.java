package com.example.project_for_nadya.service;

import com.example.project_for_nadya.entity.Child;

import java.util.List;

public interface ReportService {
    public List<Child> getAllChild();

    public List<Child> getAllDebtor();


    public void saveChild(Child child);

public Child getChild(int id);

public void deleteChild(int id);
}
