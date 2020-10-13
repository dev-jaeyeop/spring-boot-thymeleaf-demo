package com.springboot.thymeleaf.controller;

import com.springboot.thymeleaf.entity.Employee;
import com.springboot.thymeleaf.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("employees")
@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("list")
    public String listEmployees(Model model) {
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);

        return "employees/list-employees";
    }

    @GetMapping("showFormForAdd")
    public String showFormForAdd(Model model) {
        model.addAttribute("employee", new Employee());

        return "employees/employee-form";
    }

    @GetMapping("showFormForUpdate")
    public String showFormForUpdate(@RequestParam Long employeeId, Model model) {
        model.addAttribute("employee", employeeService.findById(employeeId));

        return "employees/employee-form";
    }

    @PostMapping("save")
    public String save(@ModelAttribute Employee employee) {
        employeeService.save(employee);

        return "redirect:/employees/list";
    }

    @GetMapping("delete")
    public String delete(@RequestParam Long employeeId) {
        employeeService.deleteById(employeeId);

        return "redirect:/employees/list";
    }

}
