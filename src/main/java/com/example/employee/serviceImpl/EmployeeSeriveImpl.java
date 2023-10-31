package com.example.employee.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.repo.EmployeeRepo;
import com.example.employee.service.EmployeeService;

@Service
public class EmployeeSeriveImpl implements EmployeeService {
	@Autowired
	public EmployeeRepo employeerepo;
	
	@Override
    public Employee addEmployee(Employee employee) {
        return employeerepo.save(employee);
    }

 

	@Override
	public List<Employee> allEmployees() {
		return employeerepo.findAll();
	}

 

	@Override
	public String updateSalary(int id, int updatedSalary) {
		Employee em = employeerepo.findById(id).get();
		em.setSalary(updatedSalary);
		employeerepo.save(em);
        return "The salary has been updated to " + updatedSalary + " for employee " + em.getEmployeeName();
		
	}

 

	@Override
	public String deleteEmployee(int id) {
		employeerepo.deleteById(id);
		return "Employee with id " + id + " is deleted successfully....";
	}

 

	@Override
	public String updateDesignation(int id, String updatedDesignation) {
		Employee em = employeerepo.findById(id).get();
		em.setDesignation(updatedDesignation);
		employeerepo.save(em);
		return "The designation has been changed to " + updatedDesignation + " for employee " + em.getEmployeeName();
	}

 

	@Override
	public String updateAddress(int id, String updatedAddress) {
		Employee em = employeerepo.findById(id).get();
		em.setAddress(updatedAddress);
		employeerepo.save(em);
		return "The address has been changed to " + updatedAddress + " for employee " + em.getEmployeeName();
	}
}
	
	
	
	


