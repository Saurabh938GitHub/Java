package streamAndLambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CheckEvenNumber {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		System.out.println("enter the no of integers");
		int x=0;
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("enter the integers");
		for(int i=0; i<x; i++) {
			Collections.addAll(list, sc.nextInt());
		}
		System.out.println("list of entered integers is: "+list);
		list.stream().filter(a -> a%2==0).forEach(System.out::println);
		long l=list.stream().filter(a -> a%2==0).count();
		System.out.println(l);
		sc.close();

	}

}
