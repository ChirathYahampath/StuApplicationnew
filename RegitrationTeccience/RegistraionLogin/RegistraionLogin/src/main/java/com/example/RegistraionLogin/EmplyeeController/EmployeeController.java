package com.example.RegistraionLogin.EmplyeeController;
import com.example.RegistraionLogin.Dto.EmployeeDTO;
import com.example.RegistraionLogin.Dto.LoginDTO;
import com.example.RegistraionLogin.Response.LoginResponse;
import com.example.RegistraionLogin.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin //connect to front end
@RequestMapping("api/v1/employee")


public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public  String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }


    @PostMapping("/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
