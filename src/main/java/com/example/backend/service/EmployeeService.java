package com.example.backend.service;


import com.example.backend.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto getEmployeeBySeq(int employeeSeq);

}
