package com.example.dance_section_crm_Spring_mvc.exeption_handling;

public class NoSuchChildExeption extends RuntimeException{

    public NoSuchChildExeption(String message) {
        super(message);
    }
}
