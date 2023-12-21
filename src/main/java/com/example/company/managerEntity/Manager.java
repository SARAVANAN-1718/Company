package com.example.company.managerEntity;

import java.util.List;

import com.example.company.staffEntity.Staff;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="manager")
public class Manager {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    
	    private int managerid;
	    private String name;
	    private int salary;
	    private int experience;
	    
	    @OneToMany(targetEntity = Staff.class,cascade = CascadeType.ALL)
	    @JoinColumn(name="managerid",referencedColumnName="managerid")
	    private List<Staff> Staff;

		public int getManagerid() {
			return managerid;
		}

		public void setManagerid(int managerid) {
			this.managerid = managerid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		public List<Staff> getStaff() {
			return Staff;
		}

		public void setStaff(List<Staff> staff) {
			Staff = staff;
		}
	    
	    
	    
	    
	 
	
}