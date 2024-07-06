package com.example.UserManagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "submodules")
public class SubModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="module_id")
    private AppModule module;


    public SubModule() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppModule getModule() {
        return module;
    }

    public void setModule(AppModule module) {
        this.module = module;
    }
}
