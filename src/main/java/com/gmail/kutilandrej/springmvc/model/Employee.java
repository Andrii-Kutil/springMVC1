package com.gmail.kutilandrej.springmvc.model;

import com.gmail.kutilandrej.springmvc.annotation.CheckEmail;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
  @Size(min = 2, max = 100, message = "name must be min 2 symbol!")
  @Pattern(regexp = "\\w+", message = "Only words")
  private String name;
  @NotEmpty(message = "Not empty")
  @NotBlank(message = "Not blank")
  @NotNull(message = "Not null")
  private String surname;
  @Min(value = 400, message = "Min = 400")
  @Max(value = 10000, message = "Max = 10000")
  private int salary;
  private String department;
  private Map<String, String> departments;
  private String carBrand;
  private Map<String, String> carBrands;
  private String[] languages;
  private Map<String, String> languageMap;
  @CheckEmail
  private String email;

  public Employee() {
    departments = new HashMap<>();
    departments.put("Information Technology", "IT");
    departments.put("Human Resources", "HR");
    departments.put("Sales", "Sales");

    carBrands = new HashMap<>();
    carBrands.put("BMW", "BMW");
    carBrands.put("LADA", "LADA");
    carBrands.put("AUDI", "AUDI");

    languageMap = new HashMap<>();
    languageMap.put("English", "EN");
    languageMap.put("Russian", "RU");
    languageMap.put("Ukrainian", "UK");
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Map<String, String> getDepartments() {
    return departments;
  }

  public void setDepartments(Map<String, String> departments) {
    this.departments = departments;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public Map<String, String> getCarBrands() {
    return carBrands;
  }

  public void setCarBrands(Map<String, String> carBrands) {
    this.carBrands = carBrands;
  }

  public String[] getLanguages() {
    return languages;
  }

  public void setLanguages(String[] languages) {
    this.languages = languages;
  }

  public Map<String, String> getLanguageMap() {
    return languageMap;
  }

  public void setLanguageMap(Map<String, String> languageMap) {
    this.languageMap = languageMap;
  }
}
