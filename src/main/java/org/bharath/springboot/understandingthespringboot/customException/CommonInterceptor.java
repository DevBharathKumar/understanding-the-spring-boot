package org.bharath.springboot.understandingthespringboot.customException;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CommonInterceptor extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(CustomException.class)
	public final ResponseEntity<Object> handleAllCustomException(CustomException ex)
	{
		CustomException ce = new CustomException(ex.getStatusCode(),ex.getDevMessage(),ex.getLocalizedMessage());
		return new ResponseEntity<>(ce,HttpStatus.INTERNAL_SERVER_ERROR);	
	}
}
