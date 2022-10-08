package com.prashanth.pro.springjpareact.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.prashanth.pro.springjpareact.model.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
