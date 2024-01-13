package com.fernando.socialMedia.service.implementation;

import com.fernando.socialMedia.dto.UserRequestDto;
import com.fernando.socialMedia.dto.UserResponseDto;
import com.fernando.socialMedia.model.User;
import com.fernando.socialMedia.repository.UserRepository;
import com.fernando.socialMedia.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserRepository userRepository;

    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        User user = new User();
        user.setName(userRequestDto.getName());
        user.setUsername(userRequestDto.getUsername());
        user.setEmail(userRequestDto.getEmail());
        user.setPassword(userRequestDto.getPassword());
        user.setBio(userRequestDto.getBio());
        user.setImageUrl(userRequestDto.getImageUrl());

        return mapToDto(userRepository.save(user));
    }

    @Override
    public UserResponseDto update(Long id, UserRequestDto userRequestDto) {
        User userFound = userRepository.findById(id).orElseThrow();
        userFound.setName(userRequestDto.getName());
        userFound.setUsername(userFound.getUsername());
        userFound.setBio(userFound.getBio());
        userFound.setImageUrl(userFound.getImageUrl());

        return mapToDto(userRepository.save(userFound));
    }

    private UserResponseDto mapToDto(User newUser) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(newUser.getId());
        userResponseDto.setName(newUser.getName());
        userResponseDto.setUsername(newUser.getUsername());
        userResponseDto.setEmail(newUser.getEmail());
        userResponseDto.setBio(newUser.getBio());
        userResponseDto.setImageUrl(newUser.getImageUrl());

        return userResponseDto;
    }
}
