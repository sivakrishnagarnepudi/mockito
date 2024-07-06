package com.example.UserManagement.service;

import com.example.UserManagement.model.SubModule;
import com.example.UserManagement.repo.SubModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubModuleService {
    @Autowired
    private SubModuleRepository submoduleRepository;

    public List<SubModule> getAllSubmodules() {
        return submoduleRepository.findAll();
    }

    public Optional<SubModule> getSubmoduleById(Long id) {
        return submoduleRepository.findById(id);
    }

    public SubModule createSubmodule(SubModule submodule) {
        return submoduleRepository.save(submodule);
    }

    public void deleteSubmodule(Long id) {
        submoduleRepository.deleteById(id);
    }
}
