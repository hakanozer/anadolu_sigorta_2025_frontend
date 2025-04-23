package com.works.configs;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException ex) {
        return new ResponseEntity<>(parseValid(ex.getFieldErrors()),HttpStatus.BAD_REQUEST);
    }

    private Object parseValid(List<FieldError> fieldErrors) {
        List list = new ArrayList();
        for (FieldError fieldError : fieldErrors) {
            Map<String, Object> map = new HashMap<>();
            map.put("field", fieldError.getField());
            map.put("message", fieldError.getDefaultMessage());
            map.put("rejectedValue", fieldError.getRejectedValue());
            list.add(map);
        }
        return list;
    }

}
