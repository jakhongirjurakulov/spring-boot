package com.clean.code.SpringBoot.service;

import com.clean.code.SpringBoot.domain.Employee;
import com.clean.code.SpringBoot.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public List<Employee> findByNameAndLastName(String name, String lastName) {
        return employeeRepository.findByNameAndLastName(name, lastName);
    }

    public List<Employee> findAllByNameStartingWith(String name) {
        return employeeRepository.findAllByNameStartingWith(name);
    }

    public List<Employee> findAllByNameLike(String name) {
        return employeeRepository.findAllByNameLike(name);
    }

    public List<Employee> findAllByNameEndingWith(String name) {
        return employeeRepository.findAllByNameEndingWith(name);
    }

    public List<Employee> findAllByNameLikeQuery(String name) {
        return employeeRepository.findAllByNameLikeQuery(name);
    }

    public void delete(Long id) {
        Employee employee = employeeRepository.getReferenceById(id);
        employeeRepository.delete(employee);
    }
    
    @Scheduled(cron = "0 42 13 * * *")
    public Employee saveSchedule() {
        Employee employee1 = new Employee();
        employee1.setName("qwerty");
        employee1.setLastName("qwerty");
        return employeeRepository.save(employee1);
    }
}
