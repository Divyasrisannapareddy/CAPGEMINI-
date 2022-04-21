package com.DoSelect;
import java.util.*;

public class Main 
{
	
	 public static String convertToBase7(int num) {
	        if(num < 0)return "-" + convertToBase7(-num);
	        else if(num < 7) return Integer.toString(num);
	        else
	            return convertToBase7(num/7) + convertToBase7(num%7);
	    }
	    
	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the number to be converted");
	        int i = in.nextInt();
	    	System.out.print(convertToBase7(i));
	    	in.close();
	    }

}
