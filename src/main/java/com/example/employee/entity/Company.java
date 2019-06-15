package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * 实体Employee包含字段分别有：id, 姓名(name), 年龄(age), 性别(gender), companyId, 薪资(salary)
 * 实体Company包含字段分别有：id, 公司名(companyName), 员工数量(employeesNumber)
 */
@Entity
public class Company {

    @Id
    private Integer id;

    @Column
    private String companyName;

    private Integer employeesNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}
