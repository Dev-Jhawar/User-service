package com.example.demo.model;

import com.example.demo.enums.Gender;
import com.example.demo.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private Gender gender;

    private Role role;

    @Column(nullable = false)
    private String number;

    private String address;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
