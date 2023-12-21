package com.example.staff.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.company.staffEntity.Staff;

@Repository
public interface StaffRepositary extends JpaRepository<Staff, Integer> {

}
