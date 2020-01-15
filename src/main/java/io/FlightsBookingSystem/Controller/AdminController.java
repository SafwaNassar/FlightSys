package io.FlightsBookingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.FlightsBookingSystem.Model.Admin;
import io.FlightsBookingSystem.Service.AdminService;
// Admin Controller Class
@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	
//	using instance of admin service to show all admins using the below URL
	@RequestMapping("/admins")
	public List<Admin> getAllAdmin(){
		return adminService.getAllAdmins();
	}	
	
	
//	using instance of admin service to show one admin by his ID using the below URL
	@RequestMapping("/admins/{id}")
	public Admin getAdmin(@PathVariable String id){
		return adminService.getAdmin(id);
	}
	
	
//	using instance of admin service to add new admin using the below URL
	@RequestMapping(method = RequestMethod.POST, value = "/admins")
	public void addAdmin(@RequestBody Admin admin){
		adminService.addAdmin(admin);
	}
	
	
//	using instance of admin service to update specific admin by his ID using the below URL
	@RequestMapping(method = RequestMethod.PUT, value = "/admins/{id}")
	public void addAdmin(@RequestBody Admin admin, @PathVariable String id){
		adminService.updateAdmin(id,admin);
	}
	
	
//	using instance of admin service to delete specific admin by his ID using the below URL
	@RequestMapping(method = RequestMethod.DELETE, value = "/admins/{id}")
	public void deleteAdmin(@RequestBody Admin admin, @PathVariable String id){
		adminService.deleteAdmin(id);
	}
}