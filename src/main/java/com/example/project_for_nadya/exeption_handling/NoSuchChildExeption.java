package com.example.project_for_nadya.exeption_handling;

public class NoSuchChildExeption extends RuntimeException{

    public NoSuchChildExeption(String message) {
        super(message);
    }
}
