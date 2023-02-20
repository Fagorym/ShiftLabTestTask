package ru.nsu.shift.lab.shop.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.nsu.shift.lab.shop.exception.GoodNotExistsException;
import ru.nsu.shift.lab.shop.exception.InvalidTypeException;
import ru.nsu.shift.lab.shop.exception.NullFieldException;

@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {
    @ExceptionHandler(GoodNotExistsException.class)
    protected ResponseEntity<Object> handleNotFound(
            RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(),
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler({InvalidTypeException.class, NullFieldException.class})
    protected ResponseEntity<Object> handle(RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(),
                new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
