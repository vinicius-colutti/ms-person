package com.colutti.msperson.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.colutti.msperson.exception.ExceptionRespose;
import com.colutti.msperson.exception.ResourceNotFoundException;

@ControllerAdvice
@RestController
public class PersonHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionRespose> handleAllExceptions(Exception ex, WebRequest request) {
		ExceptionRespose exceptionRespose = new ExceptionRespose(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionRespose, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public final ResponseEntity<ExceptionRespose> handleBadRequestExceptions(Exception ex, WebRequest request) {
		ExceptionRespose exceptionRespose = new ExceptionRespose(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionRespose, HttpStatus.BAD_REQUEST);
	}


}
