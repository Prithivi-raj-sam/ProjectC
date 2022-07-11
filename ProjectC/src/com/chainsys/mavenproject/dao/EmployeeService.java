package com.chainsys.mavenproject.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {
//	@RequestMapping(value="/getAllEmployee", method=RequestMethod.Get)
	 @RequestMapping("/getAllEmployee")
	 public String getAllEmployee() {
		  String output="";
		 List<Employee> emplist = EmployeeDao.getAllEmployees();
		 Iterator<Employee> empItr = emplist.iterator();
		 while (empItr.hasNext()) {
			 Employee emp=empItr.next();
			 output+="<div>"+emp.getEmployee_id() + ", "+emp.getFirst_name()+", "+emp.getLast_name()+"</div><br>";
		 }
		 return output;
	 }
	 
//	 @RequestMapping(value="/getAllEmployee", method=RequestMethod.Get)
	 @RequestMapping("/getEmployee")
	 public  String  getData(@RequestParam(name = "id") String id) {
	     int empId = Integer.parseInt(id);
	 	Employee emp = EmployeeDao.getEmployeeById(empId);
	 		return   emp.getFirst_name()+", " + emp.getLast_name()+", " + emp.getJob_id()+", " + emp.getSalary()+", "
	 				+ emp.getHire_date()+", " + emp.getEmail() ;
	 	}
	 @RequestMapping(value="/newemployee", method=RequestMethod.POST)
	 public int addNewEmployee() { 
		 return 10;
	 }
	 @RequestMapping(value="/updateEmployee", method=RequestMethod.PUT) 
	 public int modifyEmployee() {
	 return 1;
	 }
	 @RequestMapping(value="/removeemployee", method=RequestMethod.DELETE)
	 public int deleteEmployee() { 
		 return 2;
	 }
}
