package com.clean.code.SpringBoot.web.rest;

import com.clean.code.SpringBoot.domain.Employee;
import com.clean.code.SpringBoot.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeResource {
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity create(@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    @PutMapping("/employees")
    public ResponseEntity update(@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    @GetMapping("/employees")
    public ResponseEntity findAll() {
        List<Employee> employeeList = employeeService.findAll();
        return ResponseEntity.ok(employeeList);
    }

    @GetMapping("/employees/{name}")
    public ResponseEntity findByName(@PathVariable String name) {
        List<Employee> employee1 = employeeService.findByName(name);
        return ResponseEntity.ok(employee1);
    }

    @GetMapping("/employees/search")
    public ResponseEntity findAllByNameLike(@RequestParam String name) {
        List<Employee> employee1 = employeeService.findAllByNameLikeQuery(name);
        return ResponseEntity.ok(employee1);
    }

    @DeleteMapping("employees/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        employeeService.delete(id);
        return ResponseEntity.ok("Qator o'chirildi");
    }
}
