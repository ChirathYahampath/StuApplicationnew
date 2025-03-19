package com.example.RegistraionLogin.Repo;

import com.example.RegistraionLogin.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findByEmail(String email);
    Optional<Employee> findOneByEmailAndPassword(String email, String encodedPassword);
}
