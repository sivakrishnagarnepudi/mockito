package com.example.UserManagement.controller;

import com.example.UserManagement.model.SubModule;
import com.example.UserManagement.service.SubModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/submodule")
public class SubModuleController {
    @Autowired
    private SubModuleService submoduleService;

    @GetMapping
    public List<SubModule> getAllSubmodules() {
        return submoduleService.getAllSubmodules();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubModule> getSubmoduleById(@PathVariable Long id) {
        return submoduleService.getSubmoduleById(id)
                .map(submodule -> ResponseEntity.ok().body(submodule))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public SubModule createSubmodule(@RequestBody SubModule submodule) {
        return submoduleService.createSubmodule(submodule);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubmodule(@PathVariable Long id) {
        submoduleService.deleteSubmodule(id);
        return ResponseEntity.noContent().build();
    }
}
