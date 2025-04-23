package com.example.dance_section_crm_Spring_mvc.controller;

import com.example.dance_section_crm_Spring_mvc.entity.Child;
import com.example.dance_section_crm_Spring_mvc.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {


    private final ReportService reportService;

    public MyController(ReportService reportService) {
        this.reportService = reportService;
    }


    @GetMapping("/")
    public String showAllChild(Model model) {
        List<Child> allChild = reportService.getAllChildren();
        model.addAttribute("allChild", allChild);
        return "all-Child";
    }

    @GetMapping("/showAllDebtor")
    public String showAllDebtor(Model model) {
        List<Child> allDebtor = reportService.getAllDebtors();
        model.addAttribute("allDebtor", allDebtor);
        return "all-Debtor";
    }


    @PostMapping("/addNewChild")
    public String addNewChild(Model model) {
        Child child = new Child();
        model.addAttribute("child", child);
        return "child-info";
    }

    @PostMapping("/saveChild")
    public String saveChild(@ModelAttribute("child") Child child) {
        reportService.saveChild(child);
        return "redirect:/";
    }

    @GetMapping("/mainPage")
    public String mainPage() {
        return "redirect:/";
    }


    @GetMapping("/updateInfo")
    public String updateChild(@RequestParam("childId") int id, Model model) {
        Child child = reportService.getChild(id);
        model.addAttribute("child", child);
        return "child-info";
    }


    @DeleteMapping("/deleteChild")
    public String deleteChild(@RequestParam("childId") int id) {
        reportService.deleteChild(id);
        return "redirect:/";
    }

    @GetMapping("/sortedByGroupAsc")
    public String showAllChildrenSortedByGroupAsc(Model model) {
        List<Child> allChildrenSortedByGroup = reportService.getAllChildrenSortedByGroupAsc();
        model.addAttribute("allChild", allChildrenSortedByGroup);
        return "all-Child";
    }

    @GetMapping("/sortedByGroupDesc")
    public String showAllChildrenSortedByGroupDesc(Model model) {
        List<Child> allChildrenSortedByGroup = reportService.getAllChildrenSortedByGroupDesc();
        model.addAttribute("allChild", allChildrenSortedByGroup);
        return "all-Child";
    }

}
