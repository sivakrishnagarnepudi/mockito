package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> getRoleById(Long id) {
        return roleRepository.findById(id);
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
    public Page<Role> getRolesWithPagination(int page, int size, String sortBy) {
        return roleRepository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
    }

    public List<Role> searchRoles(String query) {
        // Implement search logic based on query
        return roleRepository.findAll(); // Replace with actual search implementation
    }
}
