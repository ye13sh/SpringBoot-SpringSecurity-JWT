package com.PVR.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")// In postgres "user" is not allowed so I used "users"
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
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

}
