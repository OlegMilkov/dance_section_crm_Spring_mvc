package com.example.project_for_nadya.exeption_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ChildGlobalExeptionHendler {
    @ExceptionHandler
    public ResponseEntity<ChildIncorrectData> handleException(NoSuchChildExeption exeption){
        ChildIncorrectData data =  new ChildIncorrectData();
        data.setInfo(exeption.getMessage());
        return  new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }


}
