package com.innotech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.innotech.*;
import com.innotech.dto.CompanyDTO;
import com.innotech.model.Company;
import com.innotech.service.CompanyService;


@RestController
@RequestMapping("/companies")
public class CompanyController {
	
	    @Autowired
	    private CompanyService companyService;

	    @PostMapping("/")
	    public ResponseEntity<Company> createCompany(@RequestBody CompanyDTO companyDTO) {
	        Company newCompany = companyService.createCompany(companyDTO);
	        return ResponseEntity.ok(newCompany);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Company> getCompanyById(@PathVariable Long id) {
	        return companyService.getCompanyById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    @GetMapping("/byCode")
	    public ResponseEntity<Company> getCompanyByCode(@RequestParam String companyCode) {
	        return companyService.getCompanyByCode(companyCode)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    @PatchMapping("/{id}")
	    public ResponseEntity<Company> partialUpdateCompany(@PathVariable Long id, @RequestBody CompanyDTO companyDTO) {
	        Company updatedCompany = companyService.partialUpdateCompany(id, companyDTO);
	        return ResponseEntity.ok(updatedCompany);
	    }
	}