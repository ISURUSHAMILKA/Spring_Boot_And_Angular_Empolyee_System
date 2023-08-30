package com.example.SpringProject.Controller;


import com.example.SpringProject.DTO.EmployeeDTO;
import com.example.SpringProject.DTO.EmployeeSaveDTO;
import com.example.SpringProject.DTO.EmployeeUpdateDTO;
import com.example.SpringProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO){

        String id=employeeService.addEmployee(employeeSaveDTO);
        return id;

    }

    @GetMapping("/getemployee")
    public List<EmployeeDTO> getAllEmployee(){

        List<EmployeeDTO> allEmployee=employeeService.getAllEmployee();
        return allEmployee;

    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody EmployeeUpdateDTO employeeUpdateDTO){

    String id = employeeService.updateEmployee(employeeUpdateDTO);
    return id;


    }

    @DeleteMapping("/delete")
    public String deleteEmployee(@PathVariable(value = "id")int id){

        boolean  deleteEmployee = employeeService.deleteEmploye(id);
        return "deleted";


    }





}
