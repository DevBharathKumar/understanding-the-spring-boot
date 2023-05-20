package org.bharath.springboot.understandingthespringboot.customException;

public class CustomException extends RuntimeException
{
	private int statusCode;
	private String devMessage;
	private String userMessage;
	
	public CustomException(int statusCode, String devMessage, String userMessage) {
		super();
		this.statusCode = statusCode;
		this.devMessage = devMessage;
		this.userMessage = userMessage;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getDevMessage() {
		return devMessage;
	}
	public void setDevMessage(String devMessage) {
		this.devMessage = devMessage;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	
	
}
