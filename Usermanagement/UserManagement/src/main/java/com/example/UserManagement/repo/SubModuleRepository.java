package com.example.UserManagement.repo;

import com.example.UserManagement.model.SubModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubModuleRepository extends JpaRepository<SubModule,Long> {
}
