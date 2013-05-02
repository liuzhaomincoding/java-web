package com.gdt.shop.service;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gdt.shop.domain.Employee;

public interface EmployeeService {
	
	public List<Employee> getAll() ;
	
	public void add(Employee e);
	
	public void remove(long id);
	
	public void update(Employee e);
	
	public Employee get(long id);
}