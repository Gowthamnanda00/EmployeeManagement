package com.example.employee.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeservice;

//	public EmployeeController(EmployeeService employeeservice) {
//		super();
//		this.employeeservice = employeeservice;
//	}
	
	@GetMapping("/home")
    public String homePage(){
        return "this is a home url";
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getEmployees(){
    	return employeeservice.allEmployees();
    }
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
    	return employeeservice.addEmployee(employee);
    }

    @PutMapping("/updateSalary/{id}/{newSalary}")
    public String updateSalary(@PathVariable int id,@PathVariable int newSalary){
        return employeeservice.updateSalary(id,newSalary);
    }

    @PutMapping("/updateDesignation/{id}/{newDesignation}")
    public String updateDesignation(@PathVariable int id, @PathVariable String newDesignation) {
    	return employeeservice.updateDesignation(id, newDesignation);
    }

    @PutMapping("/updateAddress/{id}/{newAddress}")
    public String updateAddress(@PathVariable int id, @PathVariable String newAddress) {
    	return employeeservice.updateAddress(id, newAddress);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
    	return employeeservice.deleteEmployee(id);
    }

}
