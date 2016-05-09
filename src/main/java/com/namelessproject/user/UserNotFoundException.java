package com.namelessproject.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserNotFoundException() { this("user.not.found"); }
	
	public UserNotFoundException(CharSequence message) { super(message.toString()); }

}
