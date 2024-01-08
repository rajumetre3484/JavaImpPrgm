package imp_prgm;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String s = "fried";
		String s1 = "fired";
		
		char[] arr = s.toCharArray();
		char[] abb = s1.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(abb);
		
		String s2 = new String(arr);
		String s3 = new String(abb);
	
	if(s2.equals(s3))
	{
		System.out.println("ANAGRAM");
		
	}
	else
	{
		System.out.println("Not ANAGRAM");
	} 
		
	}
}
