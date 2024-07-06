package com.example.UserManagement.repo;

import com.example.UserManagement.model.AppModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<AppModule,Long> {
}
