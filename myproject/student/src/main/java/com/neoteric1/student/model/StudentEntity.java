package com.neoteric1.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name ="student")
public class StudentEntity {
    @Id
    private int sno;

    @Column(name = "name")
    private String name;
    @Column(name ="email")
    private String email;
    @Column(name ="mobile no" )
    private String mobileNo;

    public StudentEntity(){

    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }



}
