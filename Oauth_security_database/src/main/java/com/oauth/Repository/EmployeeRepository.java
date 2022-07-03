package com.oauth.Repository;

import com.oauth.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String> {

    Employee findByEmpName(String empName);
}
