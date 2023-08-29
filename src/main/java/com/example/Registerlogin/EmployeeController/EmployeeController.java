package com.example.Registerlogin.EmployeeController;

import com.example.Registerlogin.Dto.EmployeeDTO;
import com.example.Registerlogin.Dto.LoginDTO;
import com.example.Registerlogin.Service.EmployeeService;
import com.example.Registerlogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path="/save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        String id=employeeService.addEmployee(employeeDTO);
        return id;
    }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
