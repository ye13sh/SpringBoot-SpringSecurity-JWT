package com.PVR.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="authority")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class authorityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false,updatable = false)
    int id;

    String username;

    String password;

    String authority;

    String name;

    String DOB;

    String email;

    String mobile;


}
