package com.oauth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {


    @Id
    private String empId;
    private String empName;
    private String password;
    private String role;


}


//    public String getEmpId() {
//        return empId;
//    }
//
//    public void setEmpId(String empId) {
//        this.empId = empId;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empId='" + empId + '\'' +
//                ", empName='" + empName + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//
//    public Employee() {
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Employee(String empId) {
//        this.empId = empId;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
