package com.example.actuator.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.actuator.models.exceptions.ExceptionBody;
import com.example.actuator.models.exceptions.ResourceNotFoundException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class AdviceController {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionBody resourceNotFound(ResourceNotFoundException e){
        ExceptionBody exceptionBody = new ExceptionBody();
        exceptionBody.setMessage(e.getMessage());
        exceptionBody.setLocalDateTime(LocalDateTime.now());
        return exceptionBody;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionBody badCase(Exception e){
        ExceptionBody exceptionBody = new ExceptionBody();
        exceptionBody.setMessage("Все пропало, сервер помер!");
        exceptionBody.setLocalDateTime(LocalDateTime.now());
        return exceptionBody;
    }

}
