package com.fernando.socialMedia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {

    private Long id;

    private String name;

    private String username;

    private String email;

    private String bio;

    private String imageUrl;
}
