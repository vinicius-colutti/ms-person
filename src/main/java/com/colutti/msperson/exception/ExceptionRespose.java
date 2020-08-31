package com.colutti.msperson.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionRespose implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date timeStamp;

	private String message;

	private String details;

	public ExceptionRespose(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	

}
