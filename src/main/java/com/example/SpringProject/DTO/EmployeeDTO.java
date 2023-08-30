package com.example.SpringProject.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class EmployeeDTO {

    private int employeeId;

    private String employeename;

    private String employeeadress;

    private int mobile;



}
