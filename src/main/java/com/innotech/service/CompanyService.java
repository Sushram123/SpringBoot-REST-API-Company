package com.innotech.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.innotech.dto.CompanyDTO;
import com.innotech.model.Company;

@Service
public class CompanyService {

    private Map<Long, Company> companyMap = new HashMap<>();
    private long nextId = 1;

    public Company createCompany(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setId(nextId++);
        company.setCompanyName(companyDTO.getCompanyName());
        company.setEmail(companyDTO.getEmail());
        company.setStrength(companyDTO.getStrength());
        company.setWebSiteURL(companyDTO.getWebSiteURL());
        company.setCompanyCode(companyDTO.getCompanyCode());

        companyMap.put(company.getId(), company);
        return company;
    }

    public Optional<Company> getCompanyById(Long id) {
        return Optional.ofNullable(companyMap.get(id));
    }

    public Optional<Company> getCompanyByCode(String companyCode) {
        return companyMap.values().stream()
                .filter(company -> company.getCompanyCode().equals(companyCode))
                .findFirst();
    }

    public Company partialUpdateCompany(Long id, CompanyDTO companyDTO) {
        Company existingCompany = companyMap.get(id);
        if (existingCompany != null) {
            if (companyDTO.getCompanyName() != null) {
                existingCompany.setCompanyName(companyDTO.getCompanyName());
            }
            if (companyDTO.getEmail() != null) {
                existingCompany.setEmail(companyDTO.getEmail());
            }
            if (companyDTO.getStrength() != null) {
                existingCompany.setStrength(companyDTO.getStrength());
            }
            if (companyDTO.getWebSiteURL() != null) {
                existingCompany.setWebSiteURL(companyDTO.getWebSiteURL());
            }
            if (companyDTO.getCompanyCode() != null) {
                existingCompany.setCompanyCode(companyDTO.getCompanyCode());
            }
        }
        return existingCompany;
    }
}
