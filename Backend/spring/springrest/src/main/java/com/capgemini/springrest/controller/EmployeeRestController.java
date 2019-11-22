package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.beans.EmployeeInfoBean;
import com.capgemini.springrest.beans.EmployeeResponse;
import com.capgemini.springrest.service.EmployeeService;

//@Controller
@RestController // used to represent we r using restful api
@CrossOrigin(origins = "*" , allowedHeaders="*")
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;
	

	@GetMapping(path = "/getEmployee",
			produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	//	@ResponseBody
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if(employeeInfoBean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee found");
			response.setEmployeeInfoBean(employeeInfoBean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee Not Found");
			response.setEmployeeInfoBean(employeeInfoBean);
		}
		return response;
	}// End of getEmployee()


	@PutMapping(path="/addEmployee",
			consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
			produces= {MediaType.APPLICATION_JSON_VALUE})
	// @ResponseBody
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) { // @RequestBody is use to tell req is
		// coming from body
		boolean isAdded =  service.addEmployee(employeeInfoBean);
		
		EmployeeResponse response = new EmployeeResponse();
		
		if(isAdded) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Added Successfull");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to add Employee");
		}
		return response;
	}// End of addEmployee()

	@DeleteMapping(path = "/deleteEmployee",
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse deleteEmployee(int empId) {
		boolean isDeleted=  service.deleteEmployee(empId);
		
		EmployeeResponse response = new EmployeeResponse();
		
		if(isDeleted) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Deleted Successfull");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to delete Employee");
		}
		return response;
	} // End of deleteEmployee()

	@PostMapping(path = "/updateEmployee",
			produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) { 
		boolean isUpdated =  service.updateEmployee(employeeInfoBean); 
		
		EmployeeResponse response = new EmployeeResponse();
		if(isUpdated) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Updated Successfull");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to update Employee");
		}
		return response;
	}

	@GetMapping(path = "/getAll" ,
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse getAllEmployees(){ 
		List<EmployeeInfoBean> employeeList =  service.getAllEmployees(); 
		EmployeeResponse response = new EmployeeResponse();
		if(employeeList !=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employeess record found");
			response.setEmployeeList(employeeList);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Unable to find employee record");
		}
		return response;
	} // End of getAllEmployees()

}// End of class
