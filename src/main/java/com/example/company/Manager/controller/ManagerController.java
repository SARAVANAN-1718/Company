package com.example.company.Manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.ManagerRepositary.ManagerRepositary;
import com.example.company.managerEntity.Manager;

@RestController
@RequestMapping(value="/managers")
public class ManagerController {
	
	@Autowired
	
	ManagerRepositary marep;
	
	@PostMapping(value="/post")
	public String posting(@RequestBody Manager s) {
		marep.save(s);
		return "saved success";
	}
	
	//findby id
	
		@GetMapping(value="/add/{e}")
		
		public Manager find(@PathVariable int  e) {
			return marep.findById(e).get(); 
	
		}
		
		//findall
		@PostMapping(value="/adds")
		
		public List<Manager> insertEmployee1() {
		
			return marep.findAll(); 
		 
		}
		
		@GetMapping(value="/getstaffBymanager/{name}")

		public List<String> getstaffNameByManagerName(@PathVariable String name){

			return marep.getstaffNameByManagerName(name);
		}


}
