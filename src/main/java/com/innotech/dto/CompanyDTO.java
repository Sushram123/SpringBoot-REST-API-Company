package com.innotech.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class CompanyDTO {
    @Size(min = 5, message = "Company name must be at least 5 characters")
    private String companyName;

    @Email(message = "Invalid email format")
    private String email;

    @PositiveOrZero(message = "Strength should be a positive number or zero")
    private Integer strength;

    private String webSiteURL;

    @Pattern(regexp = "^[a-zA-Z]{2}[0-9]{2}[EN]$", message = "Invalid company code format")
    private String companyCode;

    // Getters and setters

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public String getWebSiteURL() {
        return webSiteURL;
    }

    public void setWebSiteURL(String webSiteURL) {
        this.webSiteURL = webSiteURL;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}