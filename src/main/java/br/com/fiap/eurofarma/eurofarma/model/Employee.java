package br.com.fiap.eurofarma.eurofarma.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {
    @Id
    private Long employee_id;

    private String name;

    private String birthDate;

    private String department;

    private String signature;
    @OneToMany(mappedBy = "employee")
    private Set<CourseStatus> courseStatuses;

    public Employee() {

    }

    public Employee(Long employee_id, String name, String birthDate, String department, Set<CourseStatus> courseStatusSet) {
        this.employee_id = employee_id;
        this.name = name;
        this.birthDate = birthDate;
        this.department = department;
        this.courseStatuses = courseStatusSet;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String siginature) {
        this.signature = siginature;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long id) {
        this.employee_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId(Long id) {
        this.employee_id = id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Set<CourseStatus> getCourseStatuses() {
        return courseStatuses;
    }

    public void setCourseStatuses(Set<CourseStatus> courseStatuses) {
        this.courseStatuses = courseStatuses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", department='" + department + '\'' +
                ", signature='" + signature + '\'' +
                ", courseStatuses=" + courseStatuses +
                '}';
    }
}
