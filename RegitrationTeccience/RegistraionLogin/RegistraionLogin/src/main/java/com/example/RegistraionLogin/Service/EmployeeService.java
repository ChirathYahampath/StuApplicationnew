package com.example.RegistraionLogin.Service;

import com.example.RegistraionLogin.Dto.EmployeeDTO;
import com.example.RegistraionLogin.Dto.LoginDTO;
import com.example.RegistraionLogin.Response.LoginResponse;

public interface EmployeeService {

    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
