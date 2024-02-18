package cz.ivosahlik.service;

import java.util.List;
import java.util.UUID;

import cz.ivosahlik.exception.UserNotFoundException;
import cz.ivosahlik.repo.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.ivosahlik.model.Employee;

@Service
public class EmployeeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	private final EmployeeRepo employeeRepo;

	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public Employee AddEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		LOGGER.info("Created user with code: {}", employee.getEmployeeCode());
		return employeeRepo.save(employee);
	}

	public List<Employee> findAllEmployees() {
		return employeeRepo.findAll();
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
	}

	public Employee findEmployeeById(Long id) {
		return employeeRepo.findEmployeeById(id)
				.orElseThrow(() -> new UserNotFoundException("User by ID " + id + " was not found"));
	}
}
