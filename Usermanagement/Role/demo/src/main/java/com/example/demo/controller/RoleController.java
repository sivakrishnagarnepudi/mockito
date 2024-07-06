package com.example.demo.controller;

import com.example.demo.model.Role;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/roles")

public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        return ResponseEntity.ok(roleService.saveRole(role));
    }

    @GetMapping
    public ResponseEntity<List<Role>> getAllRoles() {
        return ResponseEntity.ok(roleService.getAllRoles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable Long id) {
        return roleService.getRoleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Role> updateRole(@PathVariable Long id, @RequestBody Role roleDetails) {
        return roleService.getRoleById(id)
                .map(role -> {
                    role.setUserName(roleDetails.getUserName());
                    role.setRoleName(roleDetails.getRoleName());
                    role.setEmployeeId(roleDetails.getEmployeeId());
                    role.setCreatedDate(roleDetails.getCreatedDate());
                    role.setDescription(roleDetails.getDescription());
                    role.setPassword(roleDetails.getPassword());
                    return ResponseEntity.ok(roleService.saveRole(role));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRole(@PathVariable Long id) {
        if (roleService.getRoleById(id).isPresent()) {
            roleService.deleteRole(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/search")
    public List<Role> searchRoles(@RequestParam String query) {
        return roleService.searchRoles(query);
    }

    @GetMapping("/pagination")
    public Page<Role> getRolesWithPagination(@RequestParam int page, @RequestParam int size, @RequestParam String sortBy) {
        return roleService.getRolesWithPagination(page, size, sortBy);
    }

}
