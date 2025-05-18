package javaPratice;

import java.util.Scanner;

public class StringReversalUsingJava {
	public static void main(String[] args) {

	    Scanner obj= new Scanner(System.in);
	    System.out.println("enter the string");
	    String name= obj.next();
	    System.out.println("entered string is: "+name);
	    
	    char[] c=new char[name.length()];
	    
	    for(int i=0; i<name.length();i++) {
	    	c[name.length()-i-1]=name.charAt(i);
	    }
	    obj.close();
	    System.out.println("reversed string is: "+new String(c));
}
}
