package com.example.UserManagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "modules")
public class AppModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @OneToMany(mappedBy = "module",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<SubModule>subModules;

    public AppModule() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<SubModule> getSubModules() {
        return subModules;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubModules(List<SubModule> subModules) {
        this.subModules = subModules;
    }



}
