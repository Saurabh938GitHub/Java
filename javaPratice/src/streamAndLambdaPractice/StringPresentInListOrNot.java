package streamAndLambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

public class StringPresentInListOrNot {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		System.out.println("enter the no of strings");
		int x=0;
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("enter the strings");
		for(int i=0; i<x; i++) {
			Collections.addAll(list, sc.next());
		}
		System.out.println("enter the string to be serched");
		String s= sc.next();
		System.out.println("list of entered strings is: "+list);
		System.out.println("string to be sarched is: "+s);
		boolean b=list.stream().anyMatch(x1 -> x1.equals(s));
		if(b==true)
			System.out.println("string is present in list");
		else
			System.out.println("string is not present in list");
		sc.close();

	}

}
