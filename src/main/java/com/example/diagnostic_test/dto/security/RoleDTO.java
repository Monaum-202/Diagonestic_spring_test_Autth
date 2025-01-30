package com.example.diagnostic_test.dto.security;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RoleDTO {

    @Size(max = 255)
    private String roleName;

    @Size(max = 255)
    private String roleDescription;

}
