package com.PVR.ENTITY;

import jakarta.persistence.*;

@Entity
@Table(name="users")// In postgres "user" is not allowed so I used "users"
public class userEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="id", nullable = false,updatable = false)
    int id;
    @Column(name="username",nullable = false,unique = true)
    String username;
    @Column(name="password",nullable = false)
    String password;
    @Column(name="name",nullable = false)
    String name;
    @Column(name="dob",nullable = false)
    String dob;
    @Column(name="email",nullable = false)
    String email;
    @Column(name="mobile",nullable = false)
    String mobile;

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
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

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getDob() {
  return dob;
 }

 public void setDob(String dob) {
  this.dob = dob;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getMobile() {
  return mobile;
 }

 public void setMobile(String mobile) {
  this.mobile = mobile;
 }
}
