package com.example.demo.controller;

import com.example.demo.model.Modules;
import com.example.demo.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/modules")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping
    public List<Modules> getAllModules() {
        return moduleService.getAllModule();
    }

    @GetMapping("/{id}")
    public Modules getModuleById(@PathVariable int id) {
        return moduleService.getModuleById(id);
    }

    @PostMapping
    public Modules createModule(@RequestBody Modules module) {
        System.out.println(module.getModuleName()+module.getModuleType()+module.getDescription()+module.getRemarks()+module.getModuleType()+module.getStatus());
        return moduleService.createModule(module);
    }

    @PutMapping("/{id}")
    public Modules updateModule(@PathVariable int id, @RequestBody Modules module) {
        return moduleService.updateModule(id, module);
    }

    @DeleteMapping("/{id}")
    public void deleteModule(@PathVariable int id) {
        moduleService.deleteModule(id);
    }

}
