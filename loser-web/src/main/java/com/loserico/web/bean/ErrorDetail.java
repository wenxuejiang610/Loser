package com.loserico.web.bean;

import java.io.Serializable;

public class ErrorDetail implements Serializable {

	public ErrorDetail() {
	}

	public ErrorDetail(String errorMessage, String rejectedValue, String propertyPath) {
		this.errorMessage = errorMessage;
		this.rejectedValue = rejectedValue;
		this.propertyPath = propertyPath;
	}

	private static final long serialVersionUID = -7618575631216263768L;

	private String errorMessage;
	private String rejectedValue;
	private String propertyPath;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRejectedValue() {
		return rejectedValue;
	}

	public void setRejectedValue(String rejectedValue) {
		this.rejectedValue = rejectedValue;
	}

	public String getPropertyPath() {
		return propertyPath;
	}

	public void setPropertyPath(String propertyPath) {
		this.propertyPath = propertyPath;
	}

}
