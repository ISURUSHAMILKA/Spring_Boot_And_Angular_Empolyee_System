package com.example.SpringProject.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeUpdateDTO {
    private int employeeId;
    private String employeename;

    private String employeeadress;

    private int mobile;




}
