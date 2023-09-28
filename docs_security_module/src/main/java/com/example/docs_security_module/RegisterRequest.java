package com.example.docs_security_module;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class RegisterRequest {
    private String firstName;
    private String lastName;

    private String password;

    private String email;
}
