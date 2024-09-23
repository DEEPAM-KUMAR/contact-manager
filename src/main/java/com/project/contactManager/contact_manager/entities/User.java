package com.project.contactManager.contact_manager.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String userId;
    @Column(name="user_name",nullable = false)
    private String name;
    @Column(name="email",nullable = false)
    private String email;
    private String phoneNumber;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePic;
    private String password;

    //information

    private Boolean enabled=false;
    private Boolean emailVerified = false;
    private Boolean phoneVerified = false;

    private Provider provider = Provider.SELF;
    private String providerId;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private List<Contact>contacts=new ArrayList<>();
}
