package com.javapros.classfive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line = "hello world. hello helloo.!";
		
		Pattern pattern = Pattern.compile("hello");
		Matcher m = pattern.matcher(line);
		
		int count = 0;
		while(m.find()) {
			count ++;
			System.out.println("start(): "+m.start());
	        System.out.println("end(): "+m.end());
		}
		String newLine = m.replaceAll("chaithanya");
		System.out.println("count::" +count);
		System.out.println("line after replace::" +newLine);
	}

}
