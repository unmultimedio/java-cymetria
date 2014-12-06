package com.cymetria.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstClass {

	public static void main(String[] args) throws IOException {
		/*
		 * Primera clase, condicionales, input y output
		 * 
		 */
		
		String a="hello user whats ur age?";
		System.out.println(a);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String age = br.readLine();
		int agei = Integer.parseInt(age);
		String message;
		boolean answer=agei<=18;
		if (answer){
			int e=18-agei;
			message="screw u ur years "+e+" behind";
		}else{
			message="good luck";
		}
		System.out.println(message);
	}

}
