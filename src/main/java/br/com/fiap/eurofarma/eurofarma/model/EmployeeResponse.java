package br.com.fiap.eurofarma.eurofarma.model;

public record EmployeeResponse(Long employee_id, String signature, String department, String birthDate, String name, boolean status) {
}