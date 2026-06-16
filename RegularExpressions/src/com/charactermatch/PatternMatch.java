package com.charactermatch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
         String s="[\\D]";
         Pattern p=Pattern.compile(s);
         Matcher m=p.matcher("ra#2! 65A");
         while(m.find()) {
        	 System.out.println(m.start()+"-----"+m.group());
         }
         
	}

}
//d,D,s,S,w,W
//d checks only numbers
//D except numbers  
//s checks for space
//S except space
//w checks characters and numbers
//W checks special symbols

//............
//Regex	Meaning	Example Match
//\d	Digits only (0-9)	5, 123
//\D	Anything except digits	a, @, space
//\s	Whitespace characters (space, tab, newline)	" " , \t
//\S	Anything except whitespace	A, 9, #
//\w	Word characters: letters, digits, underscore (a-z, A-Z, 0-9, _)	abc, user_1
//\W	Anything except word characters (special symbols, spaces, etc.)	@, #, space