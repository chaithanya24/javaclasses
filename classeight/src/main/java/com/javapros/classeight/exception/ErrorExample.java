package com.javapros.classeight.exception;

public class ErrorExample {

	public static void main(String[] args) {
		
		while(true) {
			int i = recursive();
		}
	}

	private static int recursive() {
		return recursive();
	}

}
