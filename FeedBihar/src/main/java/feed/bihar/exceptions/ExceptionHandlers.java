package feed.bihar.exceptions;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
public class ExceptionHandlers {

	
	@org.springframework.web.bind.annotation.ExceptionHandler(value = {IOException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse badRequest(Exception ex) {
		
		return new ErrorResponse(400,"BadRequest");
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(value= {Exception.class})
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse unKnownException(Exception ex) {
		return new ErrorResponse(404,"Not Found for given ID");
	}
}
