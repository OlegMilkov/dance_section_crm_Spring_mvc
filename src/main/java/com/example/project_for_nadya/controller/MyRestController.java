package com.example.project_for_nadya.controller;

import com.example.project_for_nadya.entity.Child;
import com.example.project_for_nadya.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyRestController {

    @Autowired
    private ReportService reportService;


    @RequestMapping("/")
    public String showAllChild(Model model) {

        List<Child> allChild = reportService.getAllChild();
        model.addAttribute("allChild", allChild);
        return "allChild";
    }

    @RequestMapping("/addNewChild")
    public String addNewChild(Model model) {
        Child child = new Child();
        model.addAttribute("child", child);
        return "child-info";
    }

    @RequestMapping("/saveChild")
    public String saveChild(@ModelAttribute("child") Child child) {
        reportService.saveChild(child);
        return "redirect:/";
    }



    @RequestMapping("/updateInfo")
    public String updateChild(@RequestParam("childId") int id, Model model) {

        Child child = reportService.getChild(id);
        model.addAttribute("child", child);
        return "child-info";
    }


    @RequestMapping("/deleteChild")
    public String deleteChild(@RequestParam("childId")int id){
        reportService.deleteChild(id);
        return "redirect:/";
    }



}
