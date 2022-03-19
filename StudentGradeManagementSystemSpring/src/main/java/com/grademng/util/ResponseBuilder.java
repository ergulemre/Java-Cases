package com.grademng.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseBuilder {
	
	public static <T> ResponseEntity<ServiceResponse<T>> success(T data, String message){
		ServiceResponse<T> serviceResponse = new ServiceResponse<>();
		serviceResponse.setData(data);
		ServiceResponseHeader header = new ServiceResponseHeader();
		header.setMessage(message);
		serviceResponse.setHeader(header);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
	}
	
	public static <T> ResponseEntity<ServiceResponse<T>> success(String message){
		ServiceResponse<T> serviceResponse = new ServiceResponse<>();
		ServiceResponseHeader header = new ServiceResponseHeader();
		header.setMessage(message);
		serviceResponse.setHeader(header);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
	}

}
