package com.example.RegistraionLogin.Entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Data
@Table(name ="employee")
public class Employee {

    @Id
    @Column(name = "employeeId", length = 45 )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;

    @Column(name = "employeeName" , length = 255)
    private String employeeName;

    @Column(name = "email" , length = 255)
    private String email;

    @Column(name = "password" , length = 255)
    private String password;

    public Employee(int employeeid, String employeeName, String email, String password) {
        this.employeeid = employeeid;
        this.employeeName = employeeName;
        this.email = email;
        this.password = password;
    }

    public Employee() {
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
