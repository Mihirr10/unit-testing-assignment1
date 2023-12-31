package com.unittesting.assignment1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PlayerNotFoundExceptionHandler {

  @ExceptionHandler(PlayerNotFound.class)
  public ResponseEntity<String> exceptionHandler(PlayerNotFound ex) {
    return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
  }

}
