package com.dev.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching 
{
	public static void main(String[] args)
	{
		Pattern pat = Pattern.compile("\\d"); 	//  "\" do not work for
												// java so using with "\\"
/*
 * compile() is used to give the type of pattern to be matched
 */
		
		
		Matcher mat = pat.matcher("1");	// gives true only for the values 
										//between 0to9 but false with any other digits
		boolean b = mat.matches();
		System.out.println(b);









	}
}
