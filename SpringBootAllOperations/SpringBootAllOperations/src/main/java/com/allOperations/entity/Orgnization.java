package com.allOperations.entity;

import jakarta.persistence.*;

@Entity
@Table(name="OrgnizationDetails")
public class Orgnization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    private String Organization_Id;
    private String name;

    private String website;
    private String country;
    private String description;
    private String founded;
    private String industry;
    private long numberOfEmployee;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getOrganization_Id() {
        return Organization_Id;
    }

    public void setOrganization_Id(String organization_Id) {
        Organization_Id = organization_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public long getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(long numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public String toString() {
        return "Orgnization{" +
                "index=" + index +
                ", Organization_Id='" + Organization_Id + '\'' +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", founded='" + founded + '\'' +
                ", industry='" + industry + '\'' +
                ", numberOfEmployee=" + numberOfEmployee +
                '}';
    }
}
