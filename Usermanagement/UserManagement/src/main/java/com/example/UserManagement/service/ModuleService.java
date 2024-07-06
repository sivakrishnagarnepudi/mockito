package com.example.UserManagement.service;

import com.example.UserManagement.model.AppModule;
import com.example.UserManagement.repo.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.UserManagement.model.AppModule;
import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {
    @Autowired
    private ModuleRepository moduleRepository;

    public List<AppModule> getAllModules() {
        return moduleRepository.findAll();
    }

    public Optional<AppModule> getModuleById(Long id) {
        return moduleRepository.findById(id);
    }

    public AppModule createModule(AppModule module) {
        return moduleRepository.save(module);
    }

    public void deleteModule(Long id) {
        moduleRepository.deleteById(id);
    }
}
