package com.crud.tasks.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class CompanyInfoConfig {

    @Value("MMNycz")
    private String companyName;

    @Value("Our goal is to become the best programmer")
    private String companyGoal;

    @Value("task@crud.com")
    private String companyEmail;

    @Value("7405479001")
    private String companyPhone;

    public String getDetails() {
        return getCompanyName() + ", " + getCompanyGoal() + ", " + getCompanyEmail() + ", " + getCompanyPhone();
    }
}