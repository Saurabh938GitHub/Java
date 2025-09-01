package streamAndLambdaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KthSmallestElementInList {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		System.out.println("enter the no of integers");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("enter the integers");
		for(int i=0; i<x; i++) {
			Collections.addAll(list, sc.nextInt());
		}
		System.out.println("list of entered integers is: "+list);
		System.out.println("enter the Kth number");
		int y=sc.nextInt();
		int z= list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).get(y-1);
		System.out.println("smallest number in list at position "+ y+" is: "+z);
		sc.close();

	}

}
