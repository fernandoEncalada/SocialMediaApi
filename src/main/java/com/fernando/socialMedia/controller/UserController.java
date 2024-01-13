package com.fernando.socialMedia.controller;

import com.fernando.socialMedia.dto.UserRequestDto;
import com.fernando.socialMedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping
    private ResponseEntity<?> save(@RequestBody UserRequestDto userRequestDto){
        return new ResponseEntity<>(userService.save(userRequestDto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> update(@PathVariable Long id, @RequestBody UserRequestDto userRequestDto){
        return new ResponseEntity<>(userService.update(id, userRequestDto), HttpStatus.OK);
    }
}
