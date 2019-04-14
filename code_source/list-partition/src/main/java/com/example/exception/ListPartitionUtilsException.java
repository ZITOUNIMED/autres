package com.example.exception;

public class ListPartitionUtilsException extends RuntimeException{

	private static final long serialVersionUID = -1085400401615006876L;

	public ListPartitionUtilsException(){
		super("Liste is empty and/or taille is bigger than liste length");
	}
	
	public ListPartitionUtilsException(String message){
		super(message);
	}
}
