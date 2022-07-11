package com.chainsys.mavenproject.dao;

public class InvalidInputDataException extends Exception{
	public InvalidInputDataException() {
		super("The input Data is not valid");
	}
    public InvalidInputDataException(String message) {
    	super(message);
    }

}
