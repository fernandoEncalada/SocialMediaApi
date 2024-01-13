package com.fernando.socialMedia.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {

    private String name;

    private String username;

    private String email;

    private String password;

    private String bio;

    private String imageUrl;
}
