package com.example.actuator.models.exceptions;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExceptionBody {
    private String message;
    private LocalDateTime localDateTime;

}
