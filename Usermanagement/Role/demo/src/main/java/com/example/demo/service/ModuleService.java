package com.example.demo.service;

import com.example.demo.model.Modules;
import com.example.demo.repo.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.example.demo.model.Module;

import java.util.List;

@Service
public class ModuleService {
    @Autowired
    private ModuleRepository moduleRepository1;
    public List<Modules> getAllModule(){
        return moduleRepository1.findAll();
    }
    public Modules getModuleById(int id){
        return moduleRepository1.findById(id).orElse(null);
    }
    public Modules createModule(Modules modules){
        return moduleRepository1.save(modules);
    }
    public Modules updateModule(int id, Modules moduleDetails) {
        Modules module = moduleRepository1.findById(id).orElse(null);
        if (module != null) {
            module.setModuleName(moduleDetails.getModuleName());
            module.setDescription(moduleDetails.getDescription());
            module.setStatus(moduleDetails.getStatus());
            module.setDate(moduleDetails.getDate());
            module.setModuleType(moduleDetails.getModuleType());
            module.setRemarks(moduleDetails.getRemarks());
            return moduleRepository1.save(module);
        }
        return null;
    }
    public void deleteModule(int id) {
        moduleRepository1.deleteById(id);
    }
}
