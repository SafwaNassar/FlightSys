package io.FlightsBookingSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.FlightsBookingSystem.Model.Admin;
import io.FlightsBookingSystem.Repo.AdminRepo;

@Service
public class AdminService   {
	@Autowired
	private AdminRepo adminRepo;
	
//	Array list return all admins in the Database
	public List<Admin> getAllAdmins() {
		List<Admin> admins = new ArrayList<>();
		adminRepo.findAll()
		.forEach(admins ::add);
		return admins;
	}

	
//	method return an admin with key"ID" from the Database
	public Admin getAdmin(String id) {
		return adminRepo.findById(id).get();
	}

//	method add admin to the Database
	public void addAdmin(Admin admin) {
//		in order to encode password before saving data 
		admin.setPassword(passwordEncoder().encode(admin.getPassword()));
		adminRepo.save(admin);
		
	}
	
//	method update admin in the Database
	public  void updateAdmin(String id, Admin admin) {
		adminRepo.save(admin);
	}


//	method delete admin from the Database
	public void deleteAdmin(String id) {
		adminRepo.deleteById(id);
	}
	
	
//	Password encoder
	@Bean
	private PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}
