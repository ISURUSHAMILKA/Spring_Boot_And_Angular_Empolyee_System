package com.example.SpringProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employee {

    @Id
    @Column(name = "employee_id",length = 50)
    private int employeeId;
    @Column(name = "employee_name",length = 50)
    private String employeename;
    @Column(name = "employee_address",length = 50)
    private String employeeadress;
    @Column(name = "employee_mobile",length = 50)
    private int mobile;

    public Employee(String employeename, String employeeadress, int mobile) {
        this.employeename = employeename;
        this.employeeadress = employeeadress;
        this.mobile = mobile;
    }
}
