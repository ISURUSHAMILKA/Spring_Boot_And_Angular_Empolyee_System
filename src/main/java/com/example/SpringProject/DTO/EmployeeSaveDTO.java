package com.example.SpringProject.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeSaveDTO {



    private String employeename;

    private String employeeadress;

    private int mobile;


}
