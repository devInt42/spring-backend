package com.example.backend.service;

import java.util.List;

import com.example.backend.dto.mapping.DepartmentEmployeeDto;

public interface DepartmentEmployeeService {
	List<DepartmentEmployeeDto>getEmployeePage(int page, DepartmentEmployeeDto dto);
}
