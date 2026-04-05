package com.ranjankumarmandal.auth_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String role;
}
