package java_practice_problems;

import java.util.*;

public class Quiz6 {
	public static void main(String[] args) {
		
		String [ ]   fruits =  {"apple", "banana",  "mango",  "orange"};

        for(String  fruit :  fruits) {

            System.out.print( fruit + " " );

            if( fruit.equals("mango") ) {

                continue;

            }

            System.out.println("salad!");

            break;

        }  
	}
	
	
	
}
