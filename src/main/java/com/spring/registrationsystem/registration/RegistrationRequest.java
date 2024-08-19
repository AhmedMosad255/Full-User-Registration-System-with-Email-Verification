package com.spring.registrationsystem.registration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
