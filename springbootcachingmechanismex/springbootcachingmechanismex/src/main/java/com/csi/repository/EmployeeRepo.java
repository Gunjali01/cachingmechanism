package com.csi.repository;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    Employee findByEmpEmailIdAndEmpPassword(String empEmailId, String empPassword);
}
