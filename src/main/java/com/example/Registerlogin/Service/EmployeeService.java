package com.example.Registerlogin.Service;

import com.example.Registerlogin.Dto.EmployeeDTO;
import com.example.Registerlogin.Dto.LoginDTO;
import com.example.Registerlogin.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
