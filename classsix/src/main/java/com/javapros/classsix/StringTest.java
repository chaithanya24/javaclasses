package com.javapros.classsix;

public class StringTest {

	public static void main(String[] args) {
		
		  String accountNumber = "Value 1";
		  String divisionId = "TWC.001";
		  boolean recalculate = true;
		  String requestId = null;
		  String accountDetails = String.format("accountNumber=%s, divisionId=%s, recalculate=%b, requestId=%s", accountNumber, divisionId, recalculate, requestId);
	      System.out.println("received get entitlements request for::" + accountDetails);
	}

}
