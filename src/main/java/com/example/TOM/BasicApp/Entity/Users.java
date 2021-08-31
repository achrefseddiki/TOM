package com.example.TOM.BasicApp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Set;


@Entity
public class Users implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(nullable = false, unique = true)
    private long cin;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;


    private long phoneNumber;
    private String email;
    private String address;



    @CreatedDate
    private Instant creationDate;
    @OneToOne
    @CreatedBy
    private Users createdByUser;
    @LastModifiedDate
    private Date updatedAt;
    @OneToOne
    @LastModifiedBy
    private Users updatedByUser;


    //applicationUsers

    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String role;

    @JsonProperty
    @Column(nullable = false, columnDefinition = "BOOLEAN")
    private boolean isAccountNonExpired;
    @JsonProperty
    @Column(nullable = false, columnDefinition = "BOOLEAN")
    private boolean isAccountNonLocked;
    @JsonProperty
    @Column(nullable = false, columnDefinition = "BOOLEAN")
    private boolean isCredentialsNonExpired;
    @JsonProperty
    @Column(nullable = false, columnDefinition = "BOOLEAN")
    private boolean isEnabled;



//getter and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Users getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(Users createdByUser) {
        this.createdByUser = createdByUser;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Users getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(Users updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        isAccountNonExpired = accountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        isAccountNonLocked = accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        isCredentialsNonExpired = credentialsNonExpired;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
