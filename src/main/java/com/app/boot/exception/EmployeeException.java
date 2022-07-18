package com.app.boot.exception;

public class EmployeeException extends Exception {

	private static final long serialVersionUID = 1L;
	private int errorCode;
	private Exception exception;
	private String errorDesc;
	private String requestType;

	public EmployeeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeException(int errorCode, Exception exception, String errorDesc, String requestType) {
		super();
		this.errorCode = errorCode;
		this.exception = exception;
		this.errorDesc = errorDesc;
		this.requestType = requestType;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

}
