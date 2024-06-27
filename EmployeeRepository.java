package com.mycompany.spring;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

 
    Employee findById(Long id);
    
    Employee findByEmail(String email);
    
    List<Employee> findByFirstname(String firstname);
    
    List<Employee> findByActive(boolean active);

   
    List<Employee> findByLevelGreaterThanAndActive(int level, boolean active);
}

