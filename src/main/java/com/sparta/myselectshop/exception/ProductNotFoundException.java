package com.sparta.myselectshop.exception;

// Exception 커스텀
public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
