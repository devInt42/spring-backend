package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.CompanyDto;
import com.example.backend.service.CompanyServiceImpl;

@RestController
@RequestMapping("/api/company")
public class CompanyApiController {
	
	@Autowired
	private CompanyServiceImpl companyService;
	
	@GetMapping("/info")
	public List<CompanyDto> getallCompany() {
		return companyService.getCompanyInformation();
	}
	
	@GetMapping("/info/{company_code}")
	public CompanyDto getCompany(@RequestParam int company_code) {
		
		return companyService.getCompanyInfo(company_code);
	}
}
