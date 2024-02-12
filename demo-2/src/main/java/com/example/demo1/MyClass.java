package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
	
	@Autowired
	EmployeeRepo repo;
	
	//to add emplolyee
	@PostMapping("/addemp")
	public Employee1 addEmployee(@RequestBody Employee1 e) {
		return repo.save(e);
		
	}
	
	@DeleteMapping("/delete")
	public Employee1 deleteemp(@RequestBody Employee1 e) {
		repo.delete(e);
		return e;
		
	}
	
	//find all employee
	@GetMapping("/getemp")
	public List<Employee1> showEmp(){
		return repo.findAll();
	} 

}
