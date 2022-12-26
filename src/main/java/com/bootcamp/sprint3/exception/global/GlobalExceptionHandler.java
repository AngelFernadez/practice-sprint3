package com.bootcamp.sprint3.exception.global;



import com.bootcamp.sprint3.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice(annotations = RestController.class)
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionResponseDto> badRequestException(BadRequestException e) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ExceptionResponseDto(e.getMessage()));
    }

    @ExceptionHandler(EmptyException.class)
    public ResponseEntity<ExceptionResponseDto> emptyException(EmptyException e) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ExceptionResponseDto(e.getMessage()));
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionResponseDto> notFoundException(NotFoundException e) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ExceptionResponseDto(e.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionValidResponseDTO> emptyException(MethodArgumentNotValidException e) {
        List<String> messages = e.getFieldErrors().stream().map(s -> s.getDefaultMessage()).collect(Collectors.toList());
        return new ResponseEntity<>(new ExceptionValidResponseDTO(messages, 400, LocalDate.now()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ExceptionResponseDto> notFoundException(HttpMessageNotReadableException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ExceptionResponseDto(e.getMessage()));
    }
}
