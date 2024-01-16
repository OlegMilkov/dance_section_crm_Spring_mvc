package com.example.project_for_nadya.dao;

import com.example.project_for_nadya.entity.Child;

import java.util.List;

public interface ReportDao {
    public List<Child> getAllChild();

    public void saveChild(Child child);

    public Child getChild(int id);

public void deleteChild (int id);


}
