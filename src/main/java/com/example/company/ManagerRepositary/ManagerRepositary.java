package com.example.company.ManagerRepositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.company.managerEntity.Manager;

public interface ManagerRepositary extends JpaRepository<Manager,Integer>{
	
@Query(value="select staff_details.name from staff_details inner join manager_details on staff_details.manager_id = manager_details.manager_id where manager_details.name = ?",nativeQuery = true)


List<String> getstaffNameByManagerName(String name);


}
