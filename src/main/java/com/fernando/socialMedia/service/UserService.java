package com.fernando.socialMedia.service;

import com.fernando.socialMedia.dto.UserRequestDto;
import com.fernando.socialMedia.dto.UserResponseDto;

public interface UserService {
    UserResponseDto save(UserRequestDto userRequestDto);

    UserResponseDto update(Long id, UserRequestDto userRequestDto);
}
