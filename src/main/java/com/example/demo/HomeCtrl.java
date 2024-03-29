package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeCtrl {
    @GetMapping("/employeeform")
    public String loadForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employeeform";
    }

    @PostMapping("/employeeform")
    public String postForm(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee", employee);
        return "postemployee";
    }
}
