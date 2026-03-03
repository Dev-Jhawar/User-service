package com.example.demo.dto;

import com.example.demo.enums.Gender;
import com.example.demo.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateUserRequestDTO {

    @NotBlank(message = "First name is Required.")
    private String firstName;

    private String lastName;

    @NotBlank(message = "E-Mail is Required.")
    private String email;

    @Email(message = "Invalid E-Mail format")
    @NotBlank(message = "Gender is Required.")
    private Gender gender;

    private Role role;

    @NotBlank(message = "Phone Number is Required.")
    private String number;

    private String address;

}
