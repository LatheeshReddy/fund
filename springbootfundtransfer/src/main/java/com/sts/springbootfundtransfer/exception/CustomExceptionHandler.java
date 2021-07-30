package com.sts.springbootfundtransfer.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

@ExceptionHandler(UserDataAccessException.class)

public final ResponseEntity<Object> handleUserNotFoundException( UserDataAccessException ex, WebRequest request ){

List<String> details=new ArrayList<>();
details.add(ex.getLocalizedMessage());
ErrorResponse err=new ErrorResponse("Record not found",details);

return new ResponseEntity<Object>(err,HttpStatus.NOT_FOUND); 
}


@ExceptionHandler(Exception.class)
public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request){

List<String> details=new ArrayList<>();
details.add(ex.getLocalizedMessage());

ErrorResponse err=new ErrorResponse("Server Error", details);

return new ResponseEntity<Object>(err,HttpStatus.INTERNAL_SERVER_ERROR);

}

@Override
protected ResponseEntity<Object> handleMethodArgumentNotValid(
MethodArgumentNotValidException ex, HttpHeaders header, HttpStatus status, WebRequest request
){

List<String> details=new ArrayList<>();
for(ObjectError error: ex.getBindingResult().getAllErrors()){
details.add(error.getDefaultMessage());
}
ErrorResponse err=new ErrorResponse("Validation Failed", details);


return new ResponseEntity<Object>(err, HttpStatus.BAD_REQUEST);
}

}