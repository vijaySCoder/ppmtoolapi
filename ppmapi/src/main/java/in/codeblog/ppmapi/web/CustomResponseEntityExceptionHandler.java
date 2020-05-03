package in.codeblog.ppmapi.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import in.codeblog.ppmapi.exception.ProjectIdException;
import in.codeblog.ppmapi.exception.ProjectIdExceptionResponse;
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
   
	   public final   ResponseEntity<Object>   handleProjectIdException(ProjectIdException ex,WebRequest request){
		     ProjectIdExceptionResponse exceptionResponse=new ProjectIdExceptionResponse(ex.getMessage());
		     return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	   }
}
