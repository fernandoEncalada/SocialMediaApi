package com.fernando.socialMedia.exceptions;

import org.springframework.http.HttpStatus;

public class SocialMediaException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private HttpStatus status;
    private String message;
}
