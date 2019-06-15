package com.example.employee.entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/*
 * 实体Employee包含字段分别有：id, 姓名(name), 年龄(age), 性别(gender), companyId, 薪资(salary)
 * 实体Company包含字段分别有：id, 公司名(companyName), 员工数量(employeesNumber)
 */
@Entity
public class Employee {

    @Id
    private Integer id;

    @Column
    private String name;

    private Integer age;

    private String gender;

    private Integer companyId;

    private Integer salary;

    public Employee(){ };

    public Employee(Integer id, String name, Integer age, String gender, Integer companyId, Integer salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
