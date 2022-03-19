package com.grademng.util;

import java.io.Serializable;

public class ServiceResponse<T> implements Serializable {

	private T data;
	private ServiceResponseHeader header;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ServiceResponseHeader getHeader() {
		return header;
	}
	public void setHeader(ServiceResponseHeader header) {
		this.header = header;
	}
}
