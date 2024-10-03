package simplesringcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simplesringcrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
