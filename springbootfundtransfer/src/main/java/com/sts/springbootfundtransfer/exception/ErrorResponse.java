 package com.sts.springbootfundtransfer.exception;

import java.util.List;

public class ErrorResponse{

	//error msg detail
	private String message;

	//about api request processing
	private List<String> details;

	public ErrorResponse(String message, List<String> details){
	super();
	this.message=message;
	this.details=details;

	//getter setter
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}	
	
}