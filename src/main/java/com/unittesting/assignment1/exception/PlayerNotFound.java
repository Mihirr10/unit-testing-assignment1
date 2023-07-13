package com.unittesting.assignment1.exception;

public class PlayerNotFound extends RuntimeException {

  public PlayerNotFound(String message) {
    super(message);
  }
}
