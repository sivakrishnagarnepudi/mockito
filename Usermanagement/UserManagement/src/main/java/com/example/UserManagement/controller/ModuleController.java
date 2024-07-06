package com.example.UserManagement.controller;

import com.example.UserManagement.model.AppModule;
import com.example.UserManagement.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/modules")
@CrossOrigin(origins = "*")
public class ModuleController {
    @Autowired
   private ModuleService moduleService;
    @GetMapping
    private List<AppModule>getAllModules(){
        return moduleService.getAllModules();
    }
    @GetMapping("/{id}")
    public ResponseEntity<AppModule> getModuleById(@PathVariable Long id) {
        return moduleService.getModuleById(id)
                .map(module -> ResponseEntity.ok().body(module))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public AppModule createModule(@RequestBody AppModule module) {
        return moduleService.createModule(module);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModule(@PathVariable Long id) {
        moduleService.deleteModule(id);
        return ResponseEntity.noContent().build();
    }
}
