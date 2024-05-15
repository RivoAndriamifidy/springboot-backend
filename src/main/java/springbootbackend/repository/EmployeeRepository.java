package springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootbackend.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
