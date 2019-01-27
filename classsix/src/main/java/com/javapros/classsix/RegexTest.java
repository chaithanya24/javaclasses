package com.javapros.classsix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		
		String line = "hello..hello..world..!";
		
		String regex = "hello";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(line);
		
		int count = 0;
		while(matcher.find()) {
			count++;
			System.out.println("start"+matcher.start());
			System.out.println("end"+matcher.end());
		}
		System.out.println("count::" +count);
		System.out.println("length::" +(line.length())/2);
		
		
		boolean isLookingAt = matcher.lookingAt();
		System.out.println("isLookingAt result::" + isLookingAt);
		
		boolean isMatch = matcher.matches();
		System.out.println("is Match::" +isMatch);
		
		String afterRepalce = matcher.replaceAll("world");
		
		System.out.println("afterRepalce::" +afterRepalce);
		
		String afterRepalceFirst = matcher.replaceFirst("java");
		
		System.out.println("afterRepalceFirst::" +afterRepalceFirst);
		
		String line1 = line.replaceAll("hello", "what");
		
		System.out.println("line1::" +line1);
		
		
	}

}
