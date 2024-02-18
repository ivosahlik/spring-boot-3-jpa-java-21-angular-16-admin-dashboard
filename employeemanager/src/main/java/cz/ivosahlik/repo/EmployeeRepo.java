package cz.ivosahlik.repo;

import cz.ivosahlik.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
	Optional<Employee> findEmployeeById(Long id);

	List<Employee> findEmployeeByNameContaining(String name);

}
